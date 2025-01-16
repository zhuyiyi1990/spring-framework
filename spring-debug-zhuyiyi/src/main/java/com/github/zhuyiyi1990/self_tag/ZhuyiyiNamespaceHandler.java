package com.github.zhuyiyi1990.self_tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ZhuyiyiNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}