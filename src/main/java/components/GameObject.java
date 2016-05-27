package components;

import java.awt.Color;

import utilities.Utils;

public class GameObject {
	protected int x;
	protected int y;
	protected int radius;
	protected Color color;
	protected final int maxRadius = 90;
	protected int timeAliveCounter = 0;
	protected boolean alive = true;
	protected boolean growing = false;
	
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

	public int getTimeAliveCounter() {
		return timeAliveCounter;
	}

	public void setTimeAliveCounter(int timeAliveCounter) {
		this.timeAliveCounter = timeAliveCounter;
	}
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isGrowing() {
		return growing;
	}

	public void setGrowing(boolean growing) {
		this.growing = growing;
	}
	
	
}
