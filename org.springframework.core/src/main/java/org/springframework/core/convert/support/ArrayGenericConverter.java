/*
 * Copyright 2002-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.convert.support;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.core.CollectionFactory;
import org.springframework.core.convert.TypeDescriptor;

class ArrayGenericConverter implements GenericConverter {

	private GenericConversionService conversionService;

	public ArrayGenericConverter(GenericConversionService conversionService) {
		this.conversionService = conversionService;
	}

	public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.isArray() || targetType.isArray();		
	}
	
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		if (isArrayToArray(sourceType, targetType)) {
			return convertArrayToArray(source, sourceType, targetType);
		} else if (isArrayToCollection(sourceType, targetType)) {
			return convertArrayToCollection(source, sourceType, targetType);
		} else if (isCollectionToArray(sourceType, targetType)) {
			return convertCollectionToArray(source, sourceType, targetType);
		} else if (isArrayToObject(sourceType, targetType)) {
			return convertArrayToObject(source, sourceType, targetType);			
		} else {
			return convertObjectToArray(source, sourceType, targetType);
		}
	}
	
	private boolean isArrayToArray(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.isArray() && targetType.isArray();
	}

	private Object convertArrayToArray(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		if (sourceType.isAssignableTo(targetType)) {
			return source;
		}
		TypeDescriptor sourceElementType = sourceType.getElementTypeDescriptor();
		TypeDescriptor targetElementType = targetType.getElementTypeDescriptor();
		Object target = Array.newInstance(targetElementType.getType(), Array.getLength(source));
		GenericConverter converter = conversionService.getConverter(sourceElementType, targetElementType);
		for (int i = 0; i < Array.getLength(target); i++) {
			Array.set(target, i, converter.convert(Array.get(source, i), sourceElementType, targetElementType));
		}
		return target;		
	}

	private boolean isArrayToCollection(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.isArray() && targetType.isCollection();
	}

	private Object convertArrayToCollection(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		int length = Array.getLength(source);
		Collection collection = CollectionFactory.createCollection(targetType.getType(), length);
		TypeDescriptor targetElementType = targetType.getElementTypeDescriptor();
		if (targetElementType == TypeDescriptor.NULL) {
			for (int i = 0; i < length; i++) {
				collection.add(Array.get(source, i));
			}
		} else {
			TypeDescriptor sourceElementType = sourceType.getElementTypeDescriptor();
			GenericConverter converter = conversionService.getConverter(sourceElementType, targetElementType);
			for (int i = 0; i < length; i++) {
				collection.add(converter.convert(Array.get(source, i), sourceElementType, targetElementType));
			}
		}
		return collection;
	}

	private boolean isCollectionToArray(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.isCollection() && targetType.isArray();
	}

	private Object convertCollectionToArray(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	private boolean isArrayToObject(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return sourceType.isArray();
	}

	private Object convertArrayToObject(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	private Object convertObjectToArray(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

}