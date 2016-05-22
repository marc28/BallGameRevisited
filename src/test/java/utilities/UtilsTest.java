package utilities;

import static org.junit.Assert.assertTrue;
import static utilities.Utils.makeRandomNumber;

import org.junit.Test;

public class UtilsTest {

	private int minRandom = 0;
	private int maxRandom = 50;

	@Test
	public void test() {
		for (int i = 0; i < 200; i++) {
			int returnedRandomNumber = makeRandomNumber(minRandom, maxRandom);
			assertTrue(returnedRandomNumber <= maxRandom && returnedRandomNumber >= minRandom);
		}
	}

}
