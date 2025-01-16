package com.github.zhuyiyi1990.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/hello/spring-beans.xml");
			User user = applicationContext.getBean("user", User.class);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}