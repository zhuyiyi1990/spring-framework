package com.github.zhuyiyi1990.cycle_with_aop.xml.cglib;

public class MySecondCalculator {

	private MyCalculator myCalculator;

	public MySecondCalculator() {
	}

	public MyCalculator getMyCalculator() {
		return myCalculator;
	}

	public void setMyCalculator(MyCalculator myCalculator) {
		this.myCalculator = myCalculator;
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