package com.designpatterns.creational.abstractfactory;

public class LandAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) {

		if ("Cat".equalsIgnoreCase(animalType)) {
			return new Cat();
		} else if ("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		}
		return null;
	}
}
