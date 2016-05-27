package components;

import static utilities.Utils.createRandomColour;
import static utilities.Utils.makeRandomNumber;

public class Ball extends GameObject {

	private int speed;
	private int xVelocity;
	private int yVelocity;
	

	public Ball(int x, int y) {
		super(x, y);
		speed = makeRandomNumber(10, 16);
		xVelocity = (int) (speed * Math.cos(Math.toRadians(makeRandomNumber(-360, 900))));
		yVelocity = (int) (-speed * Math.cos(Math.toRadians(makeRandomNumber(-360, 900))));
		this.setColor(createRandomColour());
		this.setRadius(makeRandomNumber(5, 10));
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
