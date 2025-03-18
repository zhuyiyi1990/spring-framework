package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/test")
	public String test1(Map<String, String> map) {
		map.put("hello", "Hello, SpringMVC!");
		return "hello";
	}

	@RequestMapping(value = "/test*")
	public String test2(Map<String, String> map) {
		map.put("hello", "Hello, everybody!");
		return "hello";
	}

}