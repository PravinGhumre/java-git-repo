package com.designpatterns.creational.singleton;

public enum EnumSingleton {
	INSTANCE;
	public static void doSomething() {
		// do something
	}

	public static EnumSingleton getInstance() {
		return INSTANCE;
	}
}
