package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8080/spring-mymvc-zhuyiyi/myConverter/test?user=1-zhuyiyi-18-pass123456
@Controller
@RequestMapping("/myConverter")
public class MyConverterController {

	@RequestMapping("/test")
	public String test(User user) {
		System.out.println(user);
		return "success";
	}

}