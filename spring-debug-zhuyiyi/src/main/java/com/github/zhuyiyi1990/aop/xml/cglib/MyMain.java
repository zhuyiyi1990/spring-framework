package com.github.zhuyiyi1990.aop.xml.cglib;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/aop/xml/cglib/aop.xml");
		MyCalculator myCalculator = ac.getBean("myCalculator", MyCalculator.class);
		MySecondCalculator mySecondCalculator = ac.getBean("mySecondCalculator", MySecondCalculator.class);
		myCalculator.add(1, 2);
		mySecondCalculator.add(1, 2);
		myCalculator.div(1, 0);
	}

}