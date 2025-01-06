package com.mashibing.hello;

import com.mashibing.hello.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/mashibing/hello/spring-beans.xml");
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}

}