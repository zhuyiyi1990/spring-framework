package com.github.zhuyiyi1990.springmvc.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

	private Integer id;

	private String name;

	private String password;

	private Integer age;

	private String gender;

	private Date birthday1;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday2;

	public User() {
	}

	public User(Integer id, String name, Integer age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday1() {
		return birthday1;
	}

	public void setBirthday1(Date birthday1) {
		this.birthday1 = birthday1;
	}

	public Date getBirthday2() {
		return birthday2;
	}

	public void setBirthday2(Date birthday2) {
		this.birthday2 = birthday2;
	}

	@Override
	public String toString() {
		return super.toString() + "{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", birthday1=" + birthday1 +
				", birthday2=" + birthday2 +
				'}';
	}

}