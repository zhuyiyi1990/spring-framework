package com.github.zhuyiyi1990.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyGlobalExceptionHandler {

	@ExceptionHandler(value = {UsernameException.class})
	public ModelAndView handlerException(Exception exception) {
		System.out.println("global-------handlerException1");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("exce", exception);
		return mv;
	}

	@ExceptionHandler(value = {Exception.class})
	public ModelAndView handlerException2(Exception exception) {
		System.out.println("global-------handlerException2");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("exce", exception);
		return mv;
	}

}