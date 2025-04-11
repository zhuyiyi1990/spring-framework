package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice<User> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return Objects.equals(returnType.getContainingClass(), ResponseBodyAdviceController.class);
	}

	@Override
	public User beforeBodyWrite(User body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		if (body == null) {
			body = new User();
		}
		body.setId(1);
		body.setName("MyResponseBodyAdvice");
		return body;
	}

}