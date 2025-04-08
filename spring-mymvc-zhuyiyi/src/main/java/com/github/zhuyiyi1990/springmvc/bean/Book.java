package com.github.zhuyiyi1990.springmvc.bean;

// 用来测试@InitBinder，作为接口参数的话需要加b.前缀
public class Book {

	private String name;

	public Book() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				'}';
	}

}