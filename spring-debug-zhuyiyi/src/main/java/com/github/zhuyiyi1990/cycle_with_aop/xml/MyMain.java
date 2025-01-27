package com.github.zhuyiyi1990.cycle_with_aop.xml;

import com.github.zhuyiyi1990.cycle_with_aop.xml.cglib.MySecondCalculator;
import com.github.zhuyiyi1990.cycle_with_aop.xml.cglib.MyCalculator;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "spring-debug-zhuyiyi\\build\\classes\\java\\cglib");
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/cycle_with_aop/xml/cycle_with_aop.xml");
		MyCalculator myCalculator = ac.getBean("myCalculator", MyCalculator.class);
		MySecondCalculator mySecondCalculator = ac.getBean("mySecondCalculator", MySecondCalculator.class);
		MyCalculator myTempCalculator = mySecondCalculator.getMyCalculator();
		MySecondCalculator myTempSecondCalculator = myCalculator.getMySecondCalculator();
		System.out.println(myCalculator == myTempCalculator);
		System.out.println(mySecondCalculator == myTempSecondCalculator);
		myCalculator.add(1, 2);
		mySecondCalculator.add(1, 2);
	}

}