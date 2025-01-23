package com.github.zhuyiyi1990.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

public class LogAspect {

	public LogAspect() {
	}

	private void start(JoinPoint joinPoint) {
		//获取方法签名
		Signature signature = joinPoint.getSignature();
		//获取参数信息
		Object[] args = joinPoint.getArgs();
		System.out.println("log---" + signature.getName() + "方法开始执行：参数是" + Arrays.asList(args));
	}

	public void stop(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法执行结束，结果是：" + result);
	}

	public void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法抛出异常：" + e.getMessage());
	}

	public void logFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法执行结束。。。。。over");
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Signature signature = pjp.getSignature();
		Object[] args = pjp.getArgs();
		Object result = null;
		try {
			System.out.println("log---环绕通知start：" + signature.getName() + "方法开始执行，参数为：" + Arrays.asList(args));
			//通过反射的方式调用目标的方法，相当于执行method.invoke(),可以自己修改结果值
			result = pjp.proceed(args);
			System.out.println("log---环绕通知stop" + signature.getName() + "方法执行结束");
		} catch (Throwable throwable) {
			System.out.println("log---环绕异常通知：" + signature.getName() + "出现异常");
			throw throwable;
		} finally {
			System.out.println("log---环绕返回通知：" + signature.getName() + "方法返回结果是：" + result);
		}
		return result;
	}

}