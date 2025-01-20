package com.github.zhuyiyi1990.annotation_only;

import com.github.zhuyiyi1990.annotation_component.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		try {
			ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
			A a = applicationContext.getBean("a", A.class);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}