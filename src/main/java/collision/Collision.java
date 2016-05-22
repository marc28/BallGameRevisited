package collision;

import java.util.List;

import components.Ball;
import components.Explosion;

public class Collision {

	public static void collisionDetection(List<Ball> balls, Explosion exp) {
		if (exp != null) {
			for (Ball b : balls) {
				if (hasCollisionOccured(exp, b)) {
					b.setxVelocity(0);
					b.setyVelocity(0);
					b.setAlive(false);
				}
			}
		}
	}

	private static boolean hasCollisionOccured(Explosion exp, Ball b) {
		double xDif = b.getX() - exp.getX(); // the x values
		double yDif = b.getY() - exp.getY(); // the y values
		double distanceSquared = xDif * xDif + yDif * yDif;
		int calculatedDiff = (b.getRadius() + (exp.getRadius() / 2)) * (b.getRadius() + (exp.getRadius() / 2));
		boolean collision = distanceSquared < calculatedDiff;
		System.out.println("Is " + distanceSquared + " < " + calculatedDiff + " ??? --> " + collision );
		return collision;
	}
}
