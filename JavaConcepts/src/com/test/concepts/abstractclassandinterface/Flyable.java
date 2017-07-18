package com.test.concepts.abstractclassandinterface;

/*
 * Interface can have only default and public access modifiers.
 * its applicable for its methods and variables as well
 */
public abstract interface Flyable {

	static final int SPEED = 1000;

	void fly();

	/*
	 * methods can have static and strictfp implemented static methods its since
	 * JAVA 8
	 
	void dance() {
		System.out.println(" i am dancing in interface !!!");
	}
*/
}