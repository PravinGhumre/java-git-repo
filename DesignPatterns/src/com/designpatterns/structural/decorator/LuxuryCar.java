package com.designpatterns.structural.decorator;

public class LuxuryCar extends CarDecorator {
	
	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		System.out.println("Adding features of LuxuryCar !!!!");
		this.car.assemble();
	}

}
