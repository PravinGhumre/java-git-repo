package com.test.concepts.generices;

import java.util.LinkedList;
import java.util.List;

public class GenericesTest4 {

	public static void main(String[] args) {
		String loophole = GenericesTest4.loophole(10000);
		System.out.println("loophole -->> " + loophole);
	}

	public static String loophole(Integer x) {
		List<String> ys = new LinkedList<String>();
		List xs = ys;
		xs.add(x); // Compile-time unchecked warning
		return ys.iterator().next();
	}

}
