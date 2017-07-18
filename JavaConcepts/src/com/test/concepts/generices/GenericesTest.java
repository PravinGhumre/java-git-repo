package com.test.concepts.generices;

import java.util.ArrayList;
import java.util.List;

public class GenericesTest {

	public static void main(String[] args) {

		Banana banana = new Banana();
		Orange orange = new Orange();
		MyBanana myBanana = new MyBanana();

		List<Fruit> basketOfFruits = new ArrayList<>();
		basketOfFruits.add(banana);
		basketOfFruits.add(orange);
		basketOfFruits.add(myBanana);

		List<Banana> basketOfBananas = new ArrayList<>();
		basketOfBananas.add(banana);
		basketOfBananas.add(myBanana);

		List<MyBanana> basketOfMyBananas = new ArrayList<>();
		basketOfMyBananas.add(myBanana);
		// basketOfMyBananas.add(banana); // Is not applicable for
		// List<MyBanana>

		// Adding list of Fruits
		GenericesTest.useBasket(basketOfFruits);

		// Adding list of Banana
		// Generices is not applicable for list of banana
		// GenericesTest.useBasket(basketOfBananas);

		// Adding list of Banana
		// Generices is not applicable for list of myBanana
		// GenericesTest.useBasket(basketOfMyBananas);

		// Adding list of Fruits
		GenericesTest.useFruitBaskets(basketOfFruits);

		// Adding list of Banana
		GenericesTest.useFruitBaskets(basketOfBananas);

		// Adding list of MyBanana
		GenericesTest.useFruitBaskets(basketOfMyBananas);

		// Adding list of Fruits
		GenericesTest.useBananaBaskets(basketOfFruits); // Works if List<? super
														// Banana>

		// Adding list of Banana
		GenericesTest.useBananaBaskets(basketOfBananas);

		// Adding list of MyBanana
		// GenericesTest.useBananaBaskets(basketOfMyBananas); // Works if List<?
		// extends Banana>

		// Adding list of Fruits
		GenericesTest.useObjectBaskets(basketOfFruits); // Works if List<?
														// extends Object>

		// Adding list of Banana
		GenericesTest.useObjectBaskets(basketOfBananas); // Works if List<?
															// extends Object>

		// Adding list of MyBanana
		GenericesTest.useObjectBaskets(basketOfMyBananas); // Works if List<?
															// extends Object>

		
		// Adding list of Fruits
		GenericesTest.useBaskets(basketOfFruits); // Works if List<?
														// extends Object>

		// Adding list of Banana
		GenericesTest.useBaskets(basketOfBananas); // Works if List<?
															// extends Object>

		// Adding list of MyBanana
		GenericesTest.useBaskets(basketOfMyBananas); // Works if List<?
															// extends Object>

	}

	static void useBasket(List<Fruit> list) {
		System.out.println("----in the useBasket-------" + list.size());
	}

	static void useFruitBaskets(List<? extends Fruit> list) {
		System.out.println("----in the useFruitBaskets-------" + list.size());
	}

	static void useBananaBaskets(List<? super Banana> list) {
		System.out.println("----in the useFruitBaskets-------" + list.size());
	}

	static void useObjectBaskets(List<? extends Object> list) {
		System.out.println("----in the useFruitBaskets-------" + list.size());
	}
	
	static void useBaskets(List list) {
		System.out.println("----I am NON Generices Basket----1---" + list.size());
	}
}

class Fruit {

}

class Banana extends Fruit {

}

class MyBanana extends Banana {

}

class Orange extends Fruit {

}
