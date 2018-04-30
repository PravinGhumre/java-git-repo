package com.test.concepts.abstractclassandinterface;

public class IntefaceAmbiguityDemo implements A, B {

	public static void main(String[] args) {
		A a = new IntefaceAmbiguityDemo();
		a.play();
		A.run();
		B b = new IntefaceAmbiguityDemo();
		b.play();
	}

	public void play() {
		System.out.println("I am in play !!!");
	}

}

interface A {
	public static final int a = 10;

	public abstract void play();

	public static void run() {
		System.out.println("I am in run !!!");
	}

}

interface B {
	public static final int a = 12;

	public abstract void play();
}
