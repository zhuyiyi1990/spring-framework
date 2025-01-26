package com.github.zhuyiyi1990.tx.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/tx/xml/tx.xml");
			BookService bookService = ac.getBean("bookService", BookService.class);
			bookService.checkout("zhuyiyi", 1, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}