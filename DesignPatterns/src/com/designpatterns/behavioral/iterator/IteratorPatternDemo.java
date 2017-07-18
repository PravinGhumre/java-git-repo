package com.designpatterns.behavioral.iterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		Container namesRepository = new NameRepository();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}