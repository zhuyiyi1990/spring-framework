package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/entity")
public class EntityController {

	@RequestMapping("/testParameter")
	public String testParameter(HttpEntity<String> httpEntity) {
		System.out.println(httpEntity);
		String body = httpEntity.getBody();
		System.out.println("body = " + body);
		return "success";
	}

	@RequestMapping("/testReturnValue")
	public ResponseEntity<String> testReturnValue() {
		String str = "<h1>hello,springmvc</h1>";
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Set-Cookie", "name=zhangsan");
		return new ResponseEntity<>(str, httpHeaders, HttpStatus.OK);
	}

	@RequestMapping("/testResponseEntity1")
	public ResponseEntity<User> testResponseEntity1() {
		User user = new User();
		user.setId(1);
		user.setName("zhuyiyi");
		return new ResponseEntity<>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping("/testResponseEntity2")
	@ResponseBody
	public ResponseEntity<User> testResponseEntity2() {
		User user = new User();
		user.setId(1);
		user.setName("zhuyiyi");
		return new ResponseEntity<>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}