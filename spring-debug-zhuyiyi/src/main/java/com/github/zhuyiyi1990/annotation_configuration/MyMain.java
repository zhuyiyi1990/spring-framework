package com.github.zhuyiyi1990.annotation_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/annotation_configuration/annotation_configuration.xml");
			A a = applicationContext.getBean("a", A.class);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}