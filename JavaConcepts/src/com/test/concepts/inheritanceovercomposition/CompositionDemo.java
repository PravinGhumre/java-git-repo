package com.test.concepts.inheritanceovercomposition;

public class CompositionDemo {

	public static void main(String[] args) {

		new CompositionDemo().testComposition();
	}

	private void testComposition() {

		Bed bed = new Bed("KINGSIZE", "RED");
		Ceiling ceiling = new Ceiling("SKYBLUE", 11, Boolean.TRUE);
		Lamp lamp = new Lamp("100");
		Bedroom bedroom = new Bedroom(bed, ceiling, lamp, new Wall("EAST"), new Wall("WEST"), new Wall("SOUTH"),
				new Wall("NORTH"));
		bedroom.makeBed();
		bedroom.turnOnLamp();
	}

}
