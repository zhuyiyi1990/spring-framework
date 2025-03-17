package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/entity")
public class EntityController {

	/*
	 * curl --location 'http://localhost:8080/spring-mymvc-zhuyiyi/entity/testParameter' \
	 *      --header 'Content-Type: application/json' \
	 *      --data '{"name":"zhuyiyi"}'
	 */
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

}