package collision;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import components.Ball;
import components.Explosion;
import components.GameObject;

public class CollisionTest {

	private List<GameObject> balls;
	private GameObject explosion;

	@Before
	public void setUp() {
		balls = new ArrayList<GameObject>();
		balls.add(new Ball(20, 20)); // pos 0
		balls.add(new Ball(45, 45));
		explosion = new Explosion(0, 0);
		explosion.setRadius(explosion.getMaxRadius());

	}

	@Test
	public void testInsideCollision() throws Exception {
		//Reflection Example
		Method method = Collision.class.getDeclaredMethod("hasCollisionOccured", Explosion.class, Ball.class);
		method.setAccessible(true);
		boolean answer = (Boolean) method.invoke(new Collision(), explosion, balls.get(0));
		assertTrue(answer);
	}
	
	@Test
	public void testOutsideCollision() throws Exception {
		//Reflection Example
		Method method = Collision.class.getDeclaredMethod("hasCollisionOccured", Explosion.class, Ball.class);
		method.setAccessible(true);
		boolean answer = (Boolean) method.invoke(new Collision(), explosion, balls.get(1));
		assertFalse(answer);
	}

}
