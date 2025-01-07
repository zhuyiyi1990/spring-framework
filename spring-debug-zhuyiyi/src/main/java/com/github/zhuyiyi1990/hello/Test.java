package com.github.zhuyiyi1990.hello;

import com.github.zhuyiyi1990.hello.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/hello/spring-beans.xml");
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}

}