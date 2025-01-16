package com.github.zhuyiyi1990.self_editor;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {

	public AddressPropertyEditor() {
		// 可加断点，调试的时候就知道是哪个步骤进来的
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		this.setValue(address);
	}

}