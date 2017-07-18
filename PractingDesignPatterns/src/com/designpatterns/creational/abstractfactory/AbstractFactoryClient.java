package com.designpatterns.creational.abstractfactory;


public class AbstractFactoryClient {

	public static void main(String[] args) {

		//
		ShapeFactory opaqueShape = ShapeFactory.getShapeFactory(ShapeFactory.OPAQUE_SHAPE);

		Circle opaqueCircle = opaqueShape.getCircle();
		Tringle opaqueTringle = opaqueShape.getTringle();

		System.out.println("--opaqueCircle-getCircleColor >>> " + opaqueCircle.getCircleColor());
		System.out.println("--opaqueCircle-getCircleSize>>> "+ opaqueCircle.getCircleSize());

		System.out.println("--opaqueTringle-getTringleColor >>> " + opaqueTringle.getTringleColor());
		System.out.println("--opaqueTringle-getCircleSize >>> "+ opaqueTringle.getTringleSize());

		//
		ShapeFactory transparentShape = ShapeFactory.getShapeFactory(ShapeFactory.TRANSPARENT_SHAPE);
		
		Circle transparentCircle = transparentShape.getCircle();
		Tringle transparentTringle = transparentShape.getTringle();

		System.out.println("--transparentCircle-getCircleColor >>> " + transparentCircle.getCircleColor());
		System.out.println("--transparentCircle-getCircleSize>>> "+ transparentCircle.getCircleSize());

		System.out.println("--transparentTringle-getTringleColor >>> " + transparentTringle.getTringleColor());
		System.out.println("--transparentTringle-getCircleSize >>> "+ transparentTringle.getTringleSize());

	}

}
