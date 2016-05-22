package components;

import utilities.Utils;

public class Explosion extends GameObject{

	public Explosion(int x, int y) {
		super(x,y);
		this.setColor(Utils.createRandomColour());
		this.setRadius(1);
	}
	
}
