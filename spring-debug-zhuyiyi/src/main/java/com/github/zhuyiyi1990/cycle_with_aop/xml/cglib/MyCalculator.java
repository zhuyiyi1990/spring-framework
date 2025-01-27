package com.github.zhuyiyi1990.cycle_with_aop.xml.cglib;

public class MyCalculator {

	private MySecondCalculator mySecondCalculator;

	public MyCalculator() {
	}

	public MySecondCalculator getMySecondCalculator() {
		return mySecondCalculator;
	}

	public void setMySecondCalculator(MySecondCalculator mySecondCalculator) {
		this.mySecondCalculator = mySecondCalculator;
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