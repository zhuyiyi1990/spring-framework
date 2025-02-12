package com.github.zhuyiyi1990.springmvc.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(Map<String, String> map) {
        map.put("hello", "hello,Springmvc");
        return "hello";
    }

    @RequestMapping(value = "/hello*")
    public String hello2(Map<String, String> map) {
        map.put("hello", "hello,heihei");
        return "hello";
    }

}