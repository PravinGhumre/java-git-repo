package com.designpatterns.creational.abstractfactory;

public class OpaqueTringle implements Tringle {

	private String color;

	public OpaqueTringle(String color) {
		this.color = color;
	}

	@Override
	public String getTringleSize() {
		return "Opaque Tringle Size 200";
	}

	@Override
	public String getTringleColor() {
		return this.color;
	}
}
