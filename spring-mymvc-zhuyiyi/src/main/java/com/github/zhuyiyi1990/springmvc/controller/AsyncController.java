package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;

@RestController
@RequestMapping("/async")
public class AsyncController {

	@RequestMapping(value = "/webAsyncTask", produces = "text/plain; charset=UTF-8")
	public WebAsyncTask<String> webAsyncTask() {
		System.out.println("WebAsyncTask处理器主线程进入");
		WebAsyncTask<String> task = new WebAsyncTask<>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(5 * 1000L);
				System.out.println("WebAsyncTask处理执行中。。。");
				return "久等了";
			}
		});
		System.out.println("WebAsyncTask处理器主线程退出");
		return task;
	}

	@RequestMapping(value = "/callable", produces = "text/plain; charset=UTF-8")
	public Callable<String> callable() {
		System.out.println("Callable处理器主线程进入");
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(5 * 1000L);
				System.out.println("Callable处理执行中。。。");
				return "久等了";
			}
		};
		System.out.println("Callable处理器主线程退出");
		return callable;
	}

}