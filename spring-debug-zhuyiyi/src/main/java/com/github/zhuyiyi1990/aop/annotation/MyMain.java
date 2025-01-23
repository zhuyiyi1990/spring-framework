package com.github.zhuyiyi1990.aop.annotation;

import com.github.zhuyiyi1990.aop.annotation.cglib.MySecondCalculator;
import com.github.zhuyiyi1990.aop.annotation.jdk.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Calculator myCalculator = ac.getBean("myCalculator", Calculator.class);
		MySecondCalculator mySecondCalculator = ac.getBean("mySecondCalculator", MySecondCalculator.class);
		myCalculator.add(1, 2);
		mySecondCalculator.add(1, 2);
		myCalculator.div(1, 0);
	}

}