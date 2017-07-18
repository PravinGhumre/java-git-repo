package com.test.concepts.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Driver extends Applet {

	public void paint(Graphics g) {

		Building buliding = new Building(200, 200, 700, 700);
		buliding.draw(g);
	}
}

class Building {
	private int startX;
	private int startY;
	private int weight;
	private int height;
	private Color bgColor;
	
	
	
	/**
	 * @param startX
	 * @param startY
	 * @param weight
	 * @param height
	 * @param bgColor
	 */
	public Building(int startX, int startY, int weight, int height) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.weight = weight;
		this.height = height;
		this.bgColor = Color.BLUE;
	}


	public void draw(Graphics g) {
		g.setColor(this.bgColor);
		g.fillRect(300, 300, 200, 200);
	}
}
