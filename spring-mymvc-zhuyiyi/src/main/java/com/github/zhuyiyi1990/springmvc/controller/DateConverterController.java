package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 错误: http://localhost:8080/spring-mymvc-zhuyiyi/dateConverter/test?id=1&name=zhuyiyi&password=123456&age=18&birthday1=1990-05-18&birthday2=1949-10-01
 * 错误: http://localhost:8080/spring-mymvc-zhuyiyi/dateConverter/test?id=1&name=zhuyiyi&password=123456&age=18&birthday1=1990/05/18&birthday2=1949/10/01
 * 正确: http://localhost:8080/spring-mymvc-zhuyiyi/dateConverter/test?id=1&name=zhuyiyi&password=123456&age=18&birthday1=1990/05/18&birthday2=1949-10-01
 */
@Controller
@RequestMapping("/dateConverter")
public class DateConverterController {

	@RequestMapping("/test")
	public String test(User user) {
		System.out.println(user);
		return "success";
	}

}