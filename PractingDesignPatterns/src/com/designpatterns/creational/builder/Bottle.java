package com.designpatterns.creational.builder;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
