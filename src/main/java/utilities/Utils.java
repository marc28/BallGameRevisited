package utilities;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import components.Ball;
import gui.MainFrame;

public class Utils {
	private static Random rand = new Random();

	public static int makeRandomNumber(int min, int max) {
		int num = rand.nextInt(max - min + 1) + min;
		while (num == 0) {
			num = rand.nextInt(max - min + 1) + min;
		}
		return num;
	}

	public static Color createRandomColour() {
		final float hue = rand.nextFloat();
		final float saturation = (rand.nextInt(2000) + 1000) / 10000f;
		final float luminance = 0.9f;
		final Color color = Color.getHSBColor(hue, saturation, luminance);
		return color;
	}
	
	public static List<Ball> fillBallList() {
		List<Ball> allBalls = new ArrayList<Ball>();
		for (int i = 0; i < 10; i++) {
			int ballX = makeRandomNumber(0, MainFrame.SCREEN_WIDTH);
			int ballY = makeRandomNumber(0, MainFrame.SCREEN_HEIGHT);
			allBalls.add(new Ball(ballX, ballY));
		}
		return allBalls;
	}
}
