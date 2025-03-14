package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/viewResolver")
public class ViewResolverController {

	@RequestMapping("/static")
	public String testStatic() {
		System.out.println("static");
		return "msb:success";
	}

	@RequestMapping("/msb")
	public String testView() {
		System.out.println("testView");
		return "msb:/index";
	}

	@RequestMapping("/msb2")
	public String testView2() {
		System.out.println("testView");
		return "heihei:/index";
	}

}