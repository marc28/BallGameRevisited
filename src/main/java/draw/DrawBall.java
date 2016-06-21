package draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;

import javax.swing.JPanel;

import components.Ball;
import components.GameObject;

@SuppressWarnings("serial")
public class DrawBall extends JPanel implements IDrawObject {

	private List<Ball> balls;

	public DrawBall(List<Ball> balls) {
		this.balls = balls;
	}

	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (Ball ball : balls) {
			if (ball.isAlive()) {
				if (ball.isGrowing()) {
					IncreaseObjectSizeByTimer.increaseGameObjectSize(ball, 5);
				}
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(ball.getColor());
				DrawFromCenter.drawCenteredCircle(g2, ball.getX(), ball.getY(), ball.getRadius());
			}
		}
	}

}
