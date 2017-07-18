package com.designpatterns.creational.factory;

public class ResourceInfo {

	private String name;
	private int type;

	public static final int TYPE_DATABASE = 1;
	public static final int TYPE_LDAP = 2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
