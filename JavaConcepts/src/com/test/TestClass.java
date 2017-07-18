package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.concepts.abstractclassandinterface.Bird;
import com.test.concepts.abstractclassandinterface.Flyable;

public class TestClass {

	@Test
	public void testOne() {
		String ss = new String();
		assertEquals("ABC", "ABC");
		
		
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
	}
}
class Aeroplane implements Flyable {

	@Override
	public void fly() {

		System.out.println(" Aeroplane is flying !!!!");
	}
	
}