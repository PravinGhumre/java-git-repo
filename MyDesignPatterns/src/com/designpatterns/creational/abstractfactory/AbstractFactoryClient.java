package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {

		AnimalFactory landAnimalFactory = AnimalFactory.createAnimalFactory("LandAnimalFactory");

		Animal animal = landAnimalFactory.getAnimal("Cat");
		animal.speak();

		Animal animal1 = landAnimalFactory.getAnimal("Dog");
		animal1.speak();

		AnimalFactory seaAnimalFactory = AnimalFactory.createAnimalFactory("SeaAnimalFactory");

		Animal animal2 = seaAnimalFactory.getAnimal("Shark");
		animal2.speak();

		Animal animal3 = seaAnimalFactory.getAnimal("Octopus");
		animal3.speak();

	}

}
