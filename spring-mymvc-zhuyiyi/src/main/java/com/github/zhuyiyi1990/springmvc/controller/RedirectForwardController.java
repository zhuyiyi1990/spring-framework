package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirectForward")
public class RedirectForwardController {

	@RequestMapping("/redirect1")
	public String redirect1() {
		System.out.println("redirect1");
		return "redirect:/index.jsp";
	}

	@RequestMapping("/redirect2")
	public String redirect2() {
		System.out.println("redirect2");
		return "redirect:/redirectForward/redirect1";
	}

	@RequestMapping("/forward1")
	public String forward1() {
		System.out.println("forward1");
		return "forward:/index.jsp";
	}

	@RequestMapping("/forward2")
	public String forward2() {
		System.out.println("forward2");
		return "forward:/redirectForward/forward1";
	}

}