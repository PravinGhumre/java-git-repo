package com.designpatterns.creational.abstractfactory;

public class OpaqueCircle implements Circle {

	String color;

	public OpaqueCircle(String color) {
		this.color = color;
	}

	@Override
	public String getCircleSize() {
		return "Opaque Circle Size 100";
	}

	@Override
	public String getCircleColor() {
		return this.color;
	}

}
