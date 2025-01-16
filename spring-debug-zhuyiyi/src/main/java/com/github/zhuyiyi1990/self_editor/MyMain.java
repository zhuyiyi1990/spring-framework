package com.github.zhuyiyi1990.self_editor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/self_editor/self_editor.xml");
			Customer customer = applicationContext.getBean("customer", Customer.class);
			System.out.println(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}