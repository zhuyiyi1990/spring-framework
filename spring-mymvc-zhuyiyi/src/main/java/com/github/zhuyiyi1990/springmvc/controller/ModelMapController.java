package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/modelMap")
public class ModelMapController {

	@RequestMapping("/test1")
	public String test1(Map<String, Object> map) {
		map.put("msg", "hello, test1");
		System.out.println(map.getClass());
		return "success";
	}

	@RequestMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("msg", "hello, test2");
		System.out.println(model.getClass());
		return "success";
	}

	@RequestMapping("/test3")
	public String test3(ModelMap modelMap) {
		modelMap.addAttribute("msg", "hello, test3");
		System.out.println(modelMap.getClass());
		return "success";
	}

	@RequestMapping("/test4")
	public ModelAndView test4() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		mv.addObject("msg", "hello, test4");
		return mv;
	}

}