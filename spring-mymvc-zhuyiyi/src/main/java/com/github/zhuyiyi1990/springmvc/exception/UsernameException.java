package com.github.zhuyiyi1990.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "名字错误", value = HttpStatus.NOT_ACCEPTABLE)
public class UsernameException extends RuntimeException {

	private static final long serialVersionUID = -1367974748058332861L;

}