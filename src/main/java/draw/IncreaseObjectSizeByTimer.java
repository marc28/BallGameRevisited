package draw;

import java.awt.Graphics2D;
import java.util.List;

import components.Ball;
import components.GameObject;
import utilities.Counter;

public class IncreaseObjectSizeByTimer {
	// new branch
	public static void startTimerForExplosionExpansion(IDrawObject iDrawObject, GameObject gameObject, Graphics2D g2) {
		iDrawObject.draw(g2);
		Counter.timer(gameObject);
	}

	public static void startTimerForBallExpansion(IDrawObject iDrawObject, List<Ball> gameObjects, Graphics2D g2) {
		for (GameObject gameObject : gameObjects) {
			Counter.timer(gameObject);
		}
	}

	public static void increaseGameObjectSize(GameObject gameObject, int sizeIncrease) {
		if (gameObject.getRadius() < gameObject.getMaxRadius()) {
			gameObject.setRadius(gameObject.getRadius() + sizeIncrease);
		}
	}

}
