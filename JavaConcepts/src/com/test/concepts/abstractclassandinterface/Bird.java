package com.test.concepts.abstractclassandinterface;

public class Bird extends Animal implements Flyable {

	@Override
	public void eat() {
		System.out.println("Bird is eating");
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying !!!!");
	}

}