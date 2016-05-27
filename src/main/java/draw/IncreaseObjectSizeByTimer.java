package draw;

import java.awt.Graphics2D;
import java.util.concurrent.atomic.AtomicInteger;

import components.GameObject;
import utilities.Counter;

public class IncreaseObjectSizeByTimer {
	
	public static void startTimerForExpansion(IDrawObject iDrawObject,GameObject gameObject, Graphics2D g2) {
			iDrawObject.draw(g2);
			Counter.timer(gameObject);
	}
	
	public static void increaseGameObjectSize(GameObject gameObject, int sizeIncrease) {
		if (gameObject.getRadius() < gameObject.getMaxRadius()) {
			gameObject.setRadius(gameObject.getRadius() + sizeIncrease);
		}
	}

}
