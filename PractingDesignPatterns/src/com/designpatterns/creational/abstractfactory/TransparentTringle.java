package com.designpatterns.creational.abstractfactory;

public class TransparentTringle implements Tringle {

	private String color;

	public TransparentTringle(String color) {
		this.color = color;
	}

	@Override
	public String getTringleSize() {
		return "Transpernt Tringle Size 500";
	}

	@Override
	public String getTringleColor() {
		return this.color;
	}

}
