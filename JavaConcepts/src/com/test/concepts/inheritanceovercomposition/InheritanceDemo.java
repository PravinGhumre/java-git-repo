package com.test.concepts.inheritanceovercomposition;

public class InheritanceDemo {

	public static void main(String[] args) {

		new InheritanceDemo().testInheritance();
	}

	private void testInheritance() {

		Dog dog = new Dog("Tommy", "Brown");
		dog.bark();

		Cat cat = new Cat("Billu", "White");
		cat.makeSound();

	}

}
