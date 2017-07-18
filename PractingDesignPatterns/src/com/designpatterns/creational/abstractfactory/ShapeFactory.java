package com.designpatterns.creational.abstractfactory;




public abstract class ShapeFactory {
	
	public static final String OPAQUE_SHAPE = "OPAQUE";
	public static final String TRANSPARENT_SHAPE = "TRANSPARENT";
	
	public abstract Circle getCircle();

	public abstract Tringle getTringle();
	
	public static ShapeFactory getShapeFactory(String natureOfShape) {
		if (natureOfShape.equals(ShapeFactory.OPAQUE_SHAPE))
			return new OpaqueShapeFactory();
		else if (natureOfShape.equals(ShapeFactory.TRANSPARENT_SHAPE))
			return new TransparentShapeFactory();
		return null;
	}
}
