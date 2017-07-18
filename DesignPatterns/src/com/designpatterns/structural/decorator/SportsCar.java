package com.designpatterns.structural.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		System.out.println("Adding features of SportsCar !!!!");
		this.car.assemble();
	}
}
