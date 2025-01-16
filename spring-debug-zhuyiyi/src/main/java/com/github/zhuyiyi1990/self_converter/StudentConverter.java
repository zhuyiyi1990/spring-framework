package com.github.zhuyiyi1990.self_converter;

import com.github.zhuyiyi1990.self_editor.Address;
import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, Student> {

	@Override
	public Student convert(String source) {
		Student student = new Student();
		String[] splits = source.split("_");
		student.setId(Integer.valueOf(splits[0]));
		student.setName(splits[1]);
		Address address = new Address();
		address.setProvince(splits[2]);
		address.setCity(splits[3]);
		address.setTown(splits[4]);
		student.setAddress(address);
		return student;
	}

}