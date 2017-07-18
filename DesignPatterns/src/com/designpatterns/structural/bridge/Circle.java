package com.designpatterns.structural.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println(" Circle filled with color !!!");
		color.applyColor();
	}

}
