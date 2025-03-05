package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forward")
public class ForwardController {

    @RequestMapping("/test1")
    public String test1() {
        System.out.println("test1");
        return "forward:/index.jsp";
    }

    @RequestMapping("/test2")
    public String test2() {
        System.out.println("test2");
        return "forward:/forward/test1";
    }

}