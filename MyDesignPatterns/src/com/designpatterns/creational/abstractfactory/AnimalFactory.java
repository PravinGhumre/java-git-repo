package com.designpatterns.creational.abstractfactory;

public abstract class AnimalFactory {

	public abstract Animal getAnimal(String animalType);

	public static AnimalFactory createAnimalFactory(String factoryType) {

		AnimalFactory animalFactory = null;

		if ("LandAnimalFactory".equalsIgnoreCase(factoryType)) {
			animalFactory = new LandAnimalFactory();
		} else if ("SeaAnimalFactory".equalsIgnoreCase(factoryType)) {
			animalFactory = new SeaAnimalFactory();
		}
		return animalFactory;
	}
}
