package utilities;

import components.GameObject;

public class Counter {

	public final static int lenghtOnScreen = 40;

	public static void timer(GameObject gameObject) {
		if (gameObject.isGrowing()) {
			gameObject.setTimeAliveCounter(gameObject.getTimeAliveCounter() + 1);
			if (gameObject.getTimeAliveCounter() >= lenghtOnScreen) {
				gameObject.setGrowing(false);
				gameObject.setRadius(0);
				gameObject.setAlive(false);
			}
		}
	}
}
