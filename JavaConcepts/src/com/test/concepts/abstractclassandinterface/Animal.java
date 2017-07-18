package com.test.concepts.abstractclassandinterface;

public abstract class Animal {

	private double weight;

	public Animal() {
		super();
	}

	abstract void eat();

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

