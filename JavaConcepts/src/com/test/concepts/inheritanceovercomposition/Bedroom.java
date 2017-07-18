package com.test.concepts.inheritanceovercomposition;

public class Bedroom {

	private Bed bed;
	private Ceiling ceiling;
	private Lamp lamp;
	private Wall eastWall;
	private Wall westWall;
	private Wall southWall;
	private Wall northWall;

	public Bedroom(Bed bed, Ceiling ceiling, Lamp lamp, Wall eastWall, Wall westWall, Wall southWall, Wall northWall) {
		super();
		this.ceiling = ceiling;
		this.lamp = lamp;
		this.eastWall = eastWall;
		this.westWall = westWall;
		this.southWall = southWall;
		this.northWall = northWall;
		this.bed = bed;
	}

	private Bed getBed() {
		return bed;
	}

	private Ceiling getCeiling() {
		return ceiling;
	}

	private Lamp getLamp() {
		return lamp;
	}

	public void makeBed() {
		this.getBed().prepareBed();

	}

	public void turnOnLamp() {

		this.getLamp().turnOnLamp();
	}

}

class Ceiling {

	private String color;
	private int height;
	private boolean isPainted;

	/**
	 * @param color
	 * @param height
	 * @param isPainted
	 */
	public Ceiling(String color, int height, boolean isPainted) {
		super();
		this.color = color;
		this.height = height;
		this.isPainted = isPainted;
	}

	public String getColor() {
		return color;
	}

	public int getHeight() {
		return height;
	}

	public boolean isPainted() {
		return isPainted;
	}

}

class Wall {

	private String direction;

	public Wall(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
}

class Bed {
	private String size;
	private String bedsheet;

	public Bed(String size, String bedsheet) {
		super();
		this.size = size;
		this.bedsheet = bedsheet;
	}

	public void prepareBed() {
		System.out.println("preparing bed !!!!!!!");
	}

	public String getSize() {
		return size;
	}

	public String getBedsheet() {
		return bedsheet;
	}

}

class Lamp {

	private String voltage;

	public String getVoltage() {
		return voltage;
	}

	public void turnOnLamp() {
		System.out.println("Lamp is turned on !!!");
	}

	/**
	 * @param voltage
	 */
	public Lamp(String voltage) {
		super();
		this.voltage = voltage;
	}

}
