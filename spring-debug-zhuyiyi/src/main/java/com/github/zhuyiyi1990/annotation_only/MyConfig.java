package com.github.zhuyiyi1990.annotation_only;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github.zhuyiyi1990.annotation_component")
public class MyConfig {
}