package com.github.zhuyiyi1990.annotation_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public A a() {
		return new A();
	}

}