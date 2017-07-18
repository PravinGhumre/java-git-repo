package com.designpatterns.creational.abstractfactory;

public class TransparentCircle implements Circle {

	String color;

	public TransparentCircle(String color) {
		this.color = color;
	}

	@Override
	public String getCircleSize() {
		return "Transpernt Circle Size 1000";
	}

	@Override
	public String getCircleColor() {
		return this.color;
	}

}
