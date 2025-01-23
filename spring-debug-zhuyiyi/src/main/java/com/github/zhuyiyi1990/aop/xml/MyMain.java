package com.github.zhuyiyi1990.aop.xml;

import com.github.zhuyiyi1990.aop.xml.cglib.MySecondCalculator;
import com.github.zhuyiyi1990.aop.xml.jdk.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/aop/xml/aop.xml");
		Calculator myCalculator = ac.getBean("myCalculator", Calculator.class);
		MySecondCalculator mySecondCalculator = ac.getBean("mySecondCalculator", MySecondCalculator.class);
		myCalculator.add(1, 2);
		mySecondCalculator.add(1, 2);
		myCalculator.div(1, 0);
	}

}