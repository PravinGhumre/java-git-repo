package com.designpatterns.creational.abstractfactory;

public class TransparentShapeFactory extends ShapeFactory {

	@Override
	public Circle getCircle() {
		return new TransparentCircle(" Transparent - RED Circle");
	}

	@Override
	public Tringle getTringle() {
		return new TransparentTringle(" Transparent - RED Tringle");
	}

}
