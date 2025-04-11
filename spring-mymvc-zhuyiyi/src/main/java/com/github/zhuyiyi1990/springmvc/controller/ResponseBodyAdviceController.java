package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/responseBodyAdvice")
public class ResponseBodyAdviceController {

	@RequestMapping("/test")
	public User test(HttpServletRequest request) {
		return new User();
	}

}