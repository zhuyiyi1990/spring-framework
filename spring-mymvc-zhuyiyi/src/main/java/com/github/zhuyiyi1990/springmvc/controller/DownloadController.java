package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/download")
public class DownloadController {

	@RequestMapping("/test")
	public ResponseEntity<byte[]> test(HttpServletRequest request) {
		//获取要下载的路径
		ServletContext servletContext = request.getServletContext();
		String realPath = servletContext.getRealPath("/scripts/jquery-1.9.1.min.js");
		//通过io流对文件进行读写
		try (FileInputStream fileInputStream = new FileInputStream(realPath)) {
			byte[] bytes = new byte[fileInputStream.available()];
			fileInputStream.read(bytes);
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.set("Content-Disposition", "attachment;filename=jquery-1.9.1.min.js");
			return new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.toString().getBytes(StandardCharsets.UTF_8), null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}