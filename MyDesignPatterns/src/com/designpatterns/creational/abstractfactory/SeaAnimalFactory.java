package com.designpatterns.creational.abstractfactory;

public class SeaAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) {

		if ("Shark".equalsIgnoreCase(animalType)) {
			return new Shark();
		} else if ("Octopus".equalsIgnoreCase(animalType)) {
			return new Octopus();
		}
		return null;
	}

}
