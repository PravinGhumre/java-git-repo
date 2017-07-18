package com.designpatterns.creational.prototype;

public class PrototypeImpl extends PrototypeFactory {
	int x;

	public PrototypeImpl(int x) {
		this.x = x;
	}

	@Override
	void prototypeFactory(int x) {
		this.x = x;
	}

	@Override
	public void printValue() {
		System.out.println("Value :" + x);
	}
}