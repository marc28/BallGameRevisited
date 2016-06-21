package collision;

import java.util.List;

import components.Ball;
import components.Explosion;
import components.GameObject;

public class CollisionDetection {

	public static void detectionForBallWithExplosion(List<Ball> balls, Explosion exp) {
		if (exp != null) {
			for (Ball b : balls) {
				if (hasCollisionOccured(exp, b)) {
					b.setxVelocity(0);
					b.setyVelocity(0);
					//b.setAlive(false);
					b.setGrowing(true);
				}
			}
		}
	}

	public static void detectionForBallWithDeadBall(List<Ball> balls) {
		for (Ball deadBall : balls) {
			if (deadBall.isGrowing()) {
				for (Ball otherBall : balls) {
					if (hasCollisionOccured(deadBall, otherBall)) {
						otherBall.setxVelocity(0);
						otherBall.setyVelocity(0);
						//otherBall.setAlive(false);
						otherBall.setGrowing(true);
					}
				}
			}
		}
	}

	private static boolean hasCollisionOccured(GameObject exp, GameObject b) {
		double xDif = b.getX() - exp.getX(); // the x values
		double yDif = b.getY() - exp.getY(); // the y values
		double distanceSquared = xDif * xDif + yDif * yDif;
		int calculatedDiff = (b.getRadius() + (exp.getRadius() / 2)) * (b.getRadius() + (exp.getRadius() / 2));
		boolean collision = distanceSquared < calculatedDiff;
		//System.out.println("Is " + distanceSquared + " < " + calculatedDiff + " ??? --> " + collision);
		return collision;
	}
}
