package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.Book;
import com.github.zhuyiyi1990.springmvc.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/initBinder")
public class InitBinderController {

	@InitBinder("student")
	public void customizeBinding(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("s.");
	}

	@GetMapping("/test")
	public String test(Book book, Student student, @ModelAttribute("ma") Map<String, Object> map) {
		System.out.println("book = " + book);
		System.out.println("student = " + student);
		System.out.println("map = " + map);
		return "success";
	}

}