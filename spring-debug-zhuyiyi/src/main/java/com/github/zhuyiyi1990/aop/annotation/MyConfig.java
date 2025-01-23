package com.github.zhuyiyi1990.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.github.zhuyiyi1990.aop.annotation")
@EnableAspectJAutoProxy
public class MyConfig {
}