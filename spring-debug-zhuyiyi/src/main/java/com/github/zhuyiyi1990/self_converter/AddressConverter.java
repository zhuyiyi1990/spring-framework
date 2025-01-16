package com.github.zhuyiyi1990.self_converter;

import com.github.zhuyiyi1990.self_editor.Address;
import org.springframework.core.convert.converter.Converter;

public class AddressConverter implements Converter<String, Address> {

	@Override
	public Address convert(String source) {
		String[] s = source.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		return address;
	}

}