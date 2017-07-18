package com.designpatterns.creational.abstractfactory;

public class OpaqueShapeFactory extends ShapeFactory {

	@Override
	public Circle getCircle() {
		return new OpaqueCircle(" Opaque - RED Circle");
	}

	@Override
	public Tringle getTringle() {
		return new OpaqueTringle(" Opaque - RED Tringle");
	}

}
