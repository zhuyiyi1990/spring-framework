package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.Person;
import com.github.zhuyiyi1990.springmvc.bean.Person2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/validation")
public class ValidationController {

	@RequestMapping("/test")
	@Validated
	public String test(@Valid Person person,
					   // @Valid Person2 person2 // 放这里会报错，org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument binder.getBindingResult().hasErrors() && isBindExceptionRequired(binder, parameter) -> true && false 不能连续两个pojo，需要贴着BindingResult
					   BindingResult bindingResult,
					   @Valid Person2 person2,
					   BindingResult bindingResult2,
					   Model model) {
		System.out.println(person);
		System.out.println(person2);
		Map<String, Object> map = new HashMap<>();
		if (bindingResult.hasErrors() || bindingResult2.hasErrors()) {
			System.out.println("登陆失败");
			System.out.println("---------------------");
			// 获取到当前所有的错误
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println(fieldError.getField());
				System.out.println(fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			System.out.println("---------------------");
			List<FieldError> fieldErrors2 = bindingResult2.getFieldErrors();
			for (FieldError fieldError : fieldErrors2) {
				System.out.println(fieldError.getField());
				System.out.println(fieldError.getDefaultMessage());
			}
			model.addAttribute("errors", map);
			return "forward:/register.jsp";
		} else {
			System.out.println("登陆成功");
			return "success";
		}
	}

}