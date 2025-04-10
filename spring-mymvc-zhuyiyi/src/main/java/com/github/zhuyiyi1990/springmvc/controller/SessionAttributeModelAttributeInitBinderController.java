package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.Book;
import com.github.zhuyiyi1990.springmvc.bean.Student;
import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;

@Controller
@RequestMapping("/sessionAttributeModelAttributeInitBinder")
@SessionAttributes("user")
public class SessionAttributeModelAttributeInitBinderController {

	@ModelAttribute
	public void testModelAttribute(Model model) {
		User user = new User();
		user.setId(1);
		user.setName("张三");
		model.addAttribute("user", user);
	}

	@ModelAttribute("user2")
	public User testModelAttribute2() {
		User user = new User();
		user.setId(2);
		user.setName("李四");
		return user;
	}

	@InitBinder("student")
	public void customizeBinding(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("s.");
	}

	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(@ModelAttribute("user") User user,
									   @ModelAttribute("user2") User user2,
									   HttpServletRequest request) {
		System.out.println("user = " + user);
		System.out.println("user2 = " + user2);
		HttpSession session = request.getSession();
		Enumeration<String> attributeNames = session.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String s = attributeNames.nextElement();
			System.out.println(s);
		}
		User sessionUser = (User) session.getAttribute("user");
		System.out.println("sessionUser = " + sessionUser);
		System.out.println(user == sessionUser);
		return "success";
	}

	@GetMapping("/testModelAttributeInitBinder")
	public String testModelAttributeInitBinder(Book book, Student student, @ModelAttribute("ma") Map<String, Object> map) {
		System.out.println("book = " + book);
		System.out.println("student = " + student);
		System.out.println("map = " + map);
		return "success";
	}

}