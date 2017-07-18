package com.designpatterns.creational.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal prepareVegMeal = mealBuilder.prepareVegMeal();

		System.out.println(" Veg Meal ");

		prepareVegMeal.showItems();

		System.out.println(" Veg Meal  Cost " + prepareVegMeal.getCost());

		Meal prepareNonVegMeal = mealBuilder.prepareNonVegMeal();

		System.out.println(" Non - Veg Meal ");

		prepareNonVegMeal.showItems();

		System.out.println(" Non - Veg Meal  Cost "
				+ prepareNonVegMeal.getCost());

	}
}
