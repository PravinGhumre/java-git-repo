package com.test.concepts.abstractclassandinterface;

public class AbstractInterfaceDemo {

	public static void main(String[] args) {

		new AbstractInterfaceDemo().testMethod();
	}

	private void testMethod() {

		Bird bird = new Bird();
		bird.eat();
		bird.fly();
		
//		Flyable.dance();
	}

}
