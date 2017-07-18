package com.test.concepts.polymorphism;

public class OperatorOverloading {

	// String
	String hello = "HELLO";
	String juee = "JUEE";

	// Char
	char c = 'A';
	char b = 'B';

	// Integer
	int intOne = 100;
	int intTwo = 200;

	// Floats
	float f1 = 50.75f;
	float f2 = 100.75f;

	// Doubles
	double d1 = 150.75;
	double d2 = 200.75;

	public static void main(String[] args) {

		new OperatorOverloading().testOperOverloading();
	}

	private void testOperOverloading() {

		System.out.println(hello + juee);
		System.out.println(c + b);
		System.out.println(intOne + intTwo);

		System.out.println(hello + c);
		System.out.println(hello + intOne);
		System.out.println(c + intOne);

		System.out.println(hello + f1);
		System.out.println(hello + d1);

		System.out.println(f2 + f1);
		System.out.println(d1 + d2);

		System.out.println(d1 + f1);

		System.out.println(c + f1 + d1 + intOne);

	}

}
