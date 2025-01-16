package com.github.zhuyiyi1990.cycle;

import org.springframework.beans.factory.BeanNameAware;

public class A implements BeanNameAware {

	private B b;

	private String beanName;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
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
		return "A{" +
				"b=" + b +
				", beanName='" + beanName + '\'' +
				'}';
	}

}