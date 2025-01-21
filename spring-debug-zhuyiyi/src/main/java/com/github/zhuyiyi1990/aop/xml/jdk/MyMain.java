package com.github.zhuyiyi1990.aop.xml.jdk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/aop/xml/jdk/aop.xml");
		Calculator myCalculator = ac.getBean("myCalculator", Calculator.class);
		Calculator mySecondCalculator = ac.getBean("mySecondCalculator", Calculator.class);
		myCalculator.add(1, 2);
		mySecondCalculator.add(1, 2);
		myCalculator.div(1, 0);
	}

}