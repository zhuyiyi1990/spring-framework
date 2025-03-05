package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pathVariable")
public class PathVariableController {

    @GetMapping("/test/{id}/{name}")
    public String test(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id);
        System.out.println(name);
        return "hello";
    }

}