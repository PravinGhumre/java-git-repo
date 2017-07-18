package com.test.concepts.inheritanceovercomposition;

class Dog extends Animal {

	public Dog() {
		System.out.println("In Dog Consructor !!!");
	}

	public Dog(String name, String color) {
		super(name, color);
		System.out.println("In Dog Consructor !!!");
	}

	public void bark() {
		System.out.println("bow bow !!!!");
	}
}

class Cat extends Animal {
	public Cat(String name, String color) {
		super(name, color);
		System.out.println("In Cat Consructor !!!");
	}

	public Cat() {
		super();
		System.out.println("In Cat Consructor !!!");
	}

	public void makeSound() {
		System.out.println("mew mew !!!!");
	}
}

public abstract class Animal {

	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 */
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("In Animal Consructor !!!");
	}

	public Animal() {
		System.out.println("In Animal Consructor !!!");
	}

}
