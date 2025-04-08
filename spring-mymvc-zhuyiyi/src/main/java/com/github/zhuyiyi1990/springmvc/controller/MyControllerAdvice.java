package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

	@ModelAttribute(name = "ma")
	public Map<String, Object> myData() {
		Map<String, Object> map = new HashMap<>();
		map.put("age", 99);
		map.put("gender", "男");
		return map;
	}

	@InitBinder("book")
	public void customizeBinding(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("b.");
	}

}