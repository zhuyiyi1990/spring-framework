package com.github.zhuyiyi1990.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/hello", headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.79 Safari/537.36"})
	public String hello(Map<String, String> map) {
		map.put("hello", "hello,Springmvc");
		return "hello";
	}

	@RequestMapping(value = "/hello*")
	public String hello2(Map<String, String> map) {
		map.put("hello", "hello,heihei");
		return "hello";
	}

}