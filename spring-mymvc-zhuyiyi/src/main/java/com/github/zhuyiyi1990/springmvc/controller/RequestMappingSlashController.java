package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/slash")
public class RequestMappingSlashController {

	@RequestMapping(value = "/withSlash")
	public String withSlash() {
		return "success";
	}

	@RequestMapping(value = "withoutSlash")
	public String withoutSlash() {
		return "success";
	}

}