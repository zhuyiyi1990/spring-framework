package com.github.zhuyiyi1990.cycle;

import org.springframework.beans.factory.BeanNameAware;

public class B implements BeanNameAware {

	private A a;

	private String beanName;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setBeanName(String name) {
		beanName = name;
	}

	@Override
	public String toString() {
		return "B{" +
				"a=" + (a == null ? null : "A{}") +
				", beanName='" + beanName + '\'' +
				'}';
	}

}