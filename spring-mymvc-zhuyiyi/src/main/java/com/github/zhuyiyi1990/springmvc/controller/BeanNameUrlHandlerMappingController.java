package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanNameUrlHandlerMappingController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(this.getClass().getName() + "---------------");
		//创建对象
		ModelAndView mv = new ModelAndView();
		//添加视图名称，要跳转的页面的名称
		mv.setViewName("hello");
		//向前端页面添加的属性值
		mv.addObject("hello", "Hello, BeanNameUrlHandlerMapping!");
		return mv;
	}

}