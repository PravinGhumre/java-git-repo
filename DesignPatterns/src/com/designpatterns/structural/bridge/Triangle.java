package com.designpatterns.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println(" Tringle filled with color !!!");
		color.applyColor();
	}

}
