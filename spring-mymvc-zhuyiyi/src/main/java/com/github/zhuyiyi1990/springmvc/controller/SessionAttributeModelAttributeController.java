package com.github.zhuyiyi1990.springmvc.controller;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
@RequestMapping("/sessionAttributeModelAttribute")
@SessionAttributes("user")
public class SessionAttributeModelAttributeController {

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

	@RequestMapping("/test")
	public String test(@ModelAttribute("user") User user,
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

}