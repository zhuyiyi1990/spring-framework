package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@RequestMapping("/i18n")
public class I18nController {

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/i18n")
	public String i18n(Locale locale) {
		System.out.println(locale);
		String username = messageSource.getMessage("username", null, locale);
		System.out.println(username);
		return "forward:/testI18nController.jsp";
	}

	@RequestMapping("/i18nLocaleChange")
	public String i18nLocaleChange(@RequestParam(value = "locale", required = false) String localStr, Locale locale, HttpSession session) {
		Locale locale1;
		if (localStr != null && !"".equals(localStr)) {
			locale1 = new Locale(localStr.split("_")[0], localStr.split("_")[1]);
		} else {
			locale1 = locale;
		}
		session.setAttribute(SessionLocaleResolver.class.getName() + ".LOCALE", locale1);
		return "forward:/testI18nController.jsp";
	}

}