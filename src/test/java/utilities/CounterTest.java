package utilities;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Before;
import org.junit.Test;

import components.Explosion;

public class CounterTest {

	private Explosion explosions;

	@Before
	public void setUp() throws Exception {
		explosions = new Explosion(0, 0);
	}

	@Test
	public void onFortyIterations() {
		
	}


}
