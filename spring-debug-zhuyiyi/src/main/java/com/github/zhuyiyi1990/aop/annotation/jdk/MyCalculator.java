package com.github.zhuyiyi1990.aop.annotation.jdk;

import org.springframework.stereotype.Component;

@Component
public class MyCalculator implements Calculator {

	public MyCalculator() {
	}

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		return i - j;
	}

	@Override
	public int mul(int i, int j) {
		return i * j;
	}

	@Override
	public int div(int i, int j) {
		return i / j;
	}

}