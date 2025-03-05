package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forward")
public class ForwardController {

    @RequestMapping("/forward")
    public String forward() {
        System.out.println("forward");
        return "forward:/index.jsp";
    }

    @RequestMapping("/forward2")
    public String forward2() {
        System.out.println("forward2");
        return "forward:/forward/forward";
    }

}