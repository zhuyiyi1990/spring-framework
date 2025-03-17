package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

	@RequestMapping("/test")
	public String test() {
		// int i = 1 / 0;
		System.out.println(this.getClass().getName());
		return "success";
	}

}