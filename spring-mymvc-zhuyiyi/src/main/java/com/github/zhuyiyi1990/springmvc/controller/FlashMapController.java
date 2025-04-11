package com.github.zhuyiyi1990.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/flashMap")
public class FlashMapController {

	@RequestMapping(value = "/submitOrder")
	public String submitOrder(RedirectAttributes attr) {
		// 将参数值设置到Input_Flash_Map_Attribute中，然后放到model中
		((FlashMap) ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).
				getRequest().getAttribute(DispatcherServlet.OUTPUT_FLASH_MAP_ATTRIBUTE)).put("name", "张三丰");
		// 放到flashmap中，同时也设置到model中
		attr.addFlashAttribute("orderId", "xxx");
		// 将参数拼接到url中
		attr.addAttribute("location", "China");
		// 获取flashmap中的值
		HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest();
		FlashMap outputFlashMap = RequestContextUtils.getOutputFlashMap(request);
		System.out.println("orderId=" + outputFlashMap.get("orderId"));
		System.out.println("name=" + outputFlashMap.get("name"));
		System.out.println("location=" + outputFlashMap.get("location"));
		Object attribute = request.getAttribute(DispatcherServlet.OUTPUT_FLASH_MAP_ATTRIBUTE);
		System.out.println(attribute);
		return "redirect:/flashMap/showOrder";
	}

	@RequestMapping(value = "/showOrder")
	public String showOrder(Model model) {
		System.out.println("orderId=" + model.getAttribute("orderId"));
		System.out.println("name=" + model.getAttribute("name"));
		System.out.println("location=" + model.getAttribute("location"));
		return "order";
	}

}