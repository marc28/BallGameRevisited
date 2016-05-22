package components;

import java.awt.Color;

import utilities.Utils;

public class GameObject {
	protected int x;
	protected int y;
	private int radius;
	private Color color;
	private final int maxRadius = 90;
	
	public GameObject(int x, int y){
		this.x = x;
		this.y = y;
		color = Utils.createRandomColour();
	}
	
	public void killObject(){
		this.setRadius(0);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMaxRadius() {
		return maxRadius;
	}
}
