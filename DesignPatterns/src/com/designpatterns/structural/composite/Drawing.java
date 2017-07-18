package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillColor) {
		for (Shape sh : shapes) {
			sh.draw(fillColor);
		}

	}

	public void add(Shape shape) {
		this.shapes.add(shape);
	}

	public void remove(Shape shape) {
		this.shapes.remove(shape);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing !!");
		this.shapes.clear();
	}
}
