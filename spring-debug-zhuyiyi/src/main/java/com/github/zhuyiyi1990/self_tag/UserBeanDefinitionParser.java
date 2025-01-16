package com.github.zhuyiyi1990.self_tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	// 返回属性值所对应的对象
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具体的属性值
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}

	@Override
	protected boolean shouldGenerateIdAsFallback() {
		return true;
	}

	@Override
	protected boolean shouldParseNameAsAliases() {
		return true;
	}

}