package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainFrame {
	public static final int SCREEN_WIDTH = 500;
	public static final int SCREEN_HEIGHT = 500;
	private GamePanel gp;
	private JFrame f = new JFrame();

	public MainFrame() {
		f.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
		startGame();

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					new MainFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	public void startGame() {
		if (gp != null) {
			f.getContentPane().remove(gp);
		}
		gp = new GamePanel(this);
		f.getContentPane().add(gp);

		new Thread(gp).start();
	}
}
