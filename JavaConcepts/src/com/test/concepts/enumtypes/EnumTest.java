package com.test.concepts.enumtypes;

enum Color {

	RED("red"), BLUE("blue"), GREEN("green"), ORANGE("orange"), BLACK("black"), WHITE("white");

	private String color;

	private Color(String color) {
		this.color = color;
	}

	public String getValue() {

		return color;
	}

	public String toString() {
		return "This is the color " + color;
	}

}

public class EnumTest {

	public static void main(String[] args) {

		Color blueColor = Color.BLUE;

		System.out.println(blueColor instanceof Enum);

		System.out.println("-valueOf--> " + Color.valueOf("RED"));

		System.out.println("-name-> " + blueColor.name());

		System.out.println("--getValue-> " + Color.GREEN.getValue());

		System.out.println("-values--> " + Color.values().getClass());
	}
}
