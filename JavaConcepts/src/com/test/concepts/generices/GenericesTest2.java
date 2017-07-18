package com.test.concepts.generices;

import java.util.ArrayList;
import java.util.List;

public class GenericesTest2 {

	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<>();
		GenericesTest2.useDogHouse(dogs);

		List<Integer> integers = new ArrayList();
		integers.add(1);
		integers.add(2);
		// integers.add(1.2);
		GenericesTest2.useHouse(integers);
	}

	static void useDogHouse(List<Dog> dogs) {
		System.out.println("I am in dogs house");
	}

	static void useHouse(List integers) {
		integers.add(1.2);
		System.out.println("I am in house");
	}
}

class Dog {

}

class Car {

}