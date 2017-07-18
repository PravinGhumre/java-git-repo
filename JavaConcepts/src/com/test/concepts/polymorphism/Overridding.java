package com.test.concepts.polymorphism;

/*
 * While overriding method exception can be reduced but can <b>NOT</b> be
 * wider and visibility can be wider but can NOT be reduced..
 */
public class Overridding {

	public static void main(String[] args) {
		try {

			Fruit fruit = new Fruit();
			Fruit mango = new Mango();
			Mango pureMango = new Mango();

			// static methods can have same name but can not be overridden
			fruit.overrideMe();
			mango.overrideMe();
			pureMango.overrideMe();

			System.out.println(fruit.sum(10, 10));
			System.out.println(mango.sum(20, 20));

			// up casting works at compile and runtime as well
			Fruit fruitMan = (Fruit) pureMango;
			System.out.println(fruitMan.sum(30, 30));

			// down casting works at compile and but fails at runtime
			// ClassCastException
			Mango fruitMango = (Mango) fruit;
			System.out.println(fruitMango.sum(40, 40));

			// Compilation Error Non-Hierarchy fails at compile time only
			// Car car = (Car)fruit;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Car {
	public Number sum(int firstNumber, int secondNumber) throws Exception {
		System.out.println("-----Fruit----sum->> ");
		return firstNumber + secondNumber;
	}
}

class Fruit {
	public Fruit() {

	}

	public Number sum(int firstNumber, int secondNumber) throws Exception {
		System.out.println("-----Fruit----sum->> ");
		return firstNumber + secondNumber;
	}

	static void overrideMe() {
		System.out.println("I am in Fruit class only !!!");
	}

}

class Mango extends Fruit {
	Mango() {

	}

	public Integer sum(int firstNumber, int secondNumber) throws MyException {
		System.out.println("-----Mango----sum->> ");
		return firstNumber + secondNumber;
	}

	static void overrideMe() {
		System.out.println("I am in Mango class only !!!");

	}
}

class Banana extends Fruit {
	Banana() {

	}
}

class MyBanana extends Fruit {
	MyBanana() {

	}
}
