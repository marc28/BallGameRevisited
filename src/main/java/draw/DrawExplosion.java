package draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import components.Explosion;

@SuppressWarnings("serial")
public class DrawExplosion extends JPanel implements IDrawObject{

	private Explosion explosion;

	public DrawExplosion(Explosion explosions) {
		this.explosion = explosions;
	}
	
	public void draw(Graphics g) {
		IncreaseObjectSizeByTimer.increaseGameObjectSize(explosion,5);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(explosion.getColor());
		DrawFromCenter.drawCenteredCircle(g2, explosion.getX(), explosion.getY(), explosion.getRadius());

	}

}
