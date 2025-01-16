package com.github.zhuyiyi1990.self_converter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/self_converter/self_converter.xml");
			Student student = applicationContext.getBean("student", Student.class);
			System.out.println(student);
			ConversionService conversionService = applicationContext.getBeanFactory().getConversionService();
			student = conversionService.convert("2_朱一一_上海_上海市_徐汇区", Student.class);
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}