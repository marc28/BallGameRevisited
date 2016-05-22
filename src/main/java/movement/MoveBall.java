package movement;

import gui.MainFrame;

import java.util.List;

import components.Ball;

public class MoveBall {

	private List<Ball> balls;
	
	private int xBuffer = 15, yBuffer = 40;
	
	public MoveBall(List<Ball> balls) {
		this.balls = balls;
	}

	
	
	public void moveBall() {
		for (Ball ball : balls) {
			ball.setX(ball.getX() + ball.getxVelocity());
			ball.setY(ball.getY() + ball.getyVelocity());
			if (ball.getX() < xBuffer) {
				ball.setxVelocity(ball.getSpeed()); 
			} else if (ball.getX() > MainFrame.SCREEN_WIDTH - xBuffer) {
				ball.setxVelocity(-ball.getSpeed());
			}
			if (ball.getY() < 0) {
				ball.setyVelocity(ball.getSpeed());
			} else if (ball.getY() > MainFrame.SCREEN_HEIGHT - yBuffer) {
				ball.setyVelocity(-ball.getSpeed());
			}
		}
	}

}
