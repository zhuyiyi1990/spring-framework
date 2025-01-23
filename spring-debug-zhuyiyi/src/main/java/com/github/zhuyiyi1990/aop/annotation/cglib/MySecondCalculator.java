package com.github.zhuyiyi1990.aop.annotation.cglib;

import org.springframework.stereotype.Component;

@Component
public class MySecondCalculator {

	public MySecondCalculator() {
	}

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int mul(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}

}