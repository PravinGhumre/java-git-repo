package com.designpatterns.creational.builder;

public class BuilderClient {

	public static void main(String[] args) {

		Meal biryaniMeal = new Meal.Builder().biryani("briyani").build();

		Meal biryaniMiniMeal = new Meal.Builder().biryani("briyani").miniMeal("miniMeal").build();

		Meal fullLunch = new Meal.Builder().biryani("briyani").miniMeal("miniMeal").comboMeal("comboMeal").build();
		
		System.out.println(biryaniMeal);
		System.out.println(biryaniMiniMeal);
		System.out.println(fullLunch);
	}
}
