package com.designpatterns.creational.abstractfactory;


public class NonLuxuryVehicleFactory extends VehicleFactory {
	public Car getCar() {
		return new NonLuxuryCar("NL-C");
	}

	public SUV getSUV() {
		return new NonLuxurySUV("NL-S");
	}
}