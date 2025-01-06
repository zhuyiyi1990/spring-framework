package com.mashibing;

import com.mashibing.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}

}