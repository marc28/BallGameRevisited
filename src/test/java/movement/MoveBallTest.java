package movement;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import components.Ball;

public class MoveBallTest {
	List<Ball> balls;
	MoveBall moveUtil;

	@Before
	public void setUp() throws Exception {
		balls = new ArrayList<Ball>();
		balls.add(new Ball(0, 0));
		moveUtil = new MoveBall(balls);
	}

	@Test
	public void test() {
		assertTrue(balls.get(0).getX() == 0);
		moveUtil.moveBall();
		assertTrue(balls.get(0).getX() != 0);
	}

}
