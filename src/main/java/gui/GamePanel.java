package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JPanel;

import collision.Collision;
import components.Ball;
import components.Explosion;
import draw.DrawBall;
import draw.DrawExplosion;
import draw.IDrawObject;
import draw.IncreaseObjectSizeByTimer;
import movement.MoveBall;
import utilities.Utils;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable {
	@SuppressWarnings("unused")
	private MainFrame mainFrame;
	private IDrawObject drawBall;
	private IDrawObject drawExp;
	private List<Ball> allBalls;
	private Explosion userExplosion;
	private MoveBall move;
	private boolean drawExplosion = false;
	private AtomicInteger timeCounter = new AtomicInteger(1);
	private final int maxAllowedUserExplosions = 1;
	private int userExplosionsClicks = 0;
	private boolean gamePaused = false;

	public GamePanel(MainFrame mainFrame) {
		this.setBackground(Color.BLUE);
		this.setSize(MainFrame.SCREEN_WIDTH, MainFrame.SCREEN_HEIGHT);
		this.mainFrame = mainFrame;
		allBalls = Utils.fillBallList();
		drawBall = new DrawBall(allBalls);
		move = new MoveBall(allBalls);

		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (userExplosionsClicks < maxAllowedUserExplosions) {
					userExplosion = new Explosion(e.getX(), e.getY());
					drawExp = new DrawExplosion(userExplosion);
					drawExplosion = true;
					userExplosionsClicks++;
				}
			}
		});
	}

	public void run() {
		while (!gamePaused) {
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, MainFrame.SCREEN_WIDTH, MainFrame.SCREEN_HEIGHT);
		drawBall.draw(g2);
		move.moveBall();
		if (drawExplosion) {
			userExplosion.setGrowing(true);
			IncreaseObjectSizeByTimer.startTimerForExpansion(drawExp, userExplosion, g2);
			Collision.detectionForBallWithExplosion(allBalls, userExplosion);
			Collision.detectionForBallWithDeadBall(allBalls);
		}
		
	}
}
