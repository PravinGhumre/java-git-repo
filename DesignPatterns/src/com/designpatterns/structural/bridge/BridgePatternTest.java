package com.designpatterns.structural.bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		Shape circle = new Circle(new GreenColor());
		circle.applyColor();
	}
}
