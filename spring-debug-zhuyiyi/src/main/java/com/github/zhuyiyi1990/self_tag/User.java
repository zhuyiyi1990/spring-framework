package com.github.zhuyiyi1990.self_tag;

import org.springframework.beans.factory.BeanNameAware;

public class User implements BeanNameAware {

	private String username;

	private String email;

	private String beanName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setBeanName(String name) {
		beanName = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", email='" + email + '\'' +
				", beanName='" + beanName + '\'' +
				'}';
	}

}