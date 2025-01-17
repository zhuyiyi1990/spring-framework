package com.github.zhuyiyi1990.annotation_component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/annotation_component/annotation_component.xml");
			A a = applicationContext.getBean("a", A.class);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}