package com.github.zhuyiyi1990.springmvc.bean;

// 用来测试@InitBinder，作为接口参数的话需要加s.前缀
public class Student {

	private String name;

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

}