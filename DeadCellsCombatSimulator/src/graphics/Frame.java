package graphics;

import javax.swing.JFrame;

import main.GameThread;

public class Frame extends JFrame {
	
	private Panel p;
	GameThread g;
	public static int WIDTH = 1000, HEIGHT = 400;

	public Frame() {
		setSize(WIDTH, HEIGHT);
		setLocation(0, 0);
		p = new Panel();
		g = new GameThread(this);
		g.start();
		p.setSize(WIDTH, HEIGHT);
		add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void tick() {
		
		p.tick();
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new Frame();

	}

}
