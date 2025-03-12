package com.github.zhuyiyi1990.springmvc.converter;

import com.github.zhuyiyi1990.springmvc.bean.User;
import org.springframework.core.convert.converter.Converter;

public class MyConverter implements Converter<String, User> {

	@Override
	public User convert(String source) {
		User user = null;
		if (!source.isEmpty()) {
			String[] split = source.split("-");
			if (split.length == 4) {
				user = new User();
				user.setId(Integer.parseInt(split[0]));
				user.setName(split[1]);
				user.setAge(Integer.parseInt(split[2]));
				user.setPassword(split[3]);
			}
		}
		return user;
	}

}