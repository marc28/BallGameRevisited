package utilities;

import static org.junit.Assert.assertTrue;
import static utilities.Counter.timer;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Before;
import org.junit.Test;

import components.Explosion;

public class CounterTest {

	private AtomicInteger timeCounter;
	private Explosion explosions;

	@Before
	public void setUp() throws Exception {
		timeCounter = new AtomicInteger(1);
		explosions = new Explosion(0, 0);
	}

	@Test
	public void onFortyIterations() {
		for (int i = 1; i < Counter.lenghtOnScreen; i++) {
			timer(timeCounter, explosions);
		}
		assertTrue(timeCounter.get() == 0);
	}

	@Test
	public void belowFortyIterations() {
		for (int i = 1; i < Counter.lenghtOnScreen - 1; i++) {
			timer(timeCounter, explosions);
		}
		assertTrue(timeCounter.get() == Counter.lenghtOnScreen - 1);
	}

	@Test
	public void aboveFortyIterations() {
		for (int i = 1; i < Counter.lenghtOnScreen + 1; i++) {
			timer(timeCounter, explosions);
		}
		assertTrue(timeCounter.get() == 1);
	}
}
