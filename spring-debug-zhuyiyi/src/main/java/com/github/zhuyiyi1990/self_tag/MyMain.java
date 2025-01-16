package com.github.zhuyiyi1990.self_tag;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ObjectUtils;

public class MyMain {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/github/zhuyiyi1990/self_tag/self_tag.xml");
			String[] beanNames = applicationContext.getBeanNamesForType(User.class);
			if (!ObjectUtils.isEmpty(beanNames)) {
				for (String beanName : beanNames) {
					User user = applicationContext.getBean(beanName, User.class);
					System.out.println(user);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}