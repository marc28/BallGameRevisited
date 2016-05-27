package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import components.Explosion;
import components.GameObject;

public class CounterTest {

	private GameObject explosionGrowing;
	private GameObject notGrowingExplosion;

	@Before
	public void setUp() throws Exception {
		explosionGrowing = new Explosion(0, 0);
		explosionGrowing.setGrowing(true);
		notGrowingExplosion = new Explosion(40, 40);
	}

	@Test
	public void growingBalls() {
		assertEquals(explosionGrowing.getTimeAliveCounter(), 0);
		for (int i = 0; i < 40; i++) {
			Counter.timer(explosionGrowing);
		}
		assertEquals(explosionGrowing.getTimeAliveCounter(), 40);
		assertEquals(0, explosionGrowing.getRadius());
		assertFalse(explosionGrowing.isAlive());
		assertFalse(explosionGrowing.isGrowing());
	}
	
	@Test
	public void notGrowingBall(){
		assertEquals(notGrowingExplosion.getTimeAliveCounter(), 0);
		for (int i = 0; i < 40; i++) {
			Counter.timer(notGrowingExplosion);
		}
		assertEquals(notGrowingExplosion.getTimeAliveCounter(), 0);
		assertTrue(notGrowingExplosion.isAlive());
		assertFalse(notGrowingExplosion.isGrowing());
		assertEquals(notGrowingExplosion.getRadius(), 1);
	}

}
