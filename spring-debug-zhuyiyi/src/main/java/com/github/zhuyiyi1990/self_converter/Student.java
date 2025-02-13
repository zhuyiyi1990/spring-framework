package com.github.zhuyiyi1990.self_converter;

import com.github.zhuyiyi1990.self_editor.Address;

public class Student {

	private Integer id;

	private String name;

	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address=" + address +
				'}';
	}

}