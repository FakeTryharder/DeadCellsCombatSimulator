package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import characters.*;
import characters.enemies.*;
import interfaces.*;

public class Panel extends JPanel {

	List<Drawable> charactersList = new ArrayList<>();
	int 
		initialEnemyX = Frame.WIDTH - 2 * Enemy.WIDTH, 
		initialEnemyY = Frame.HEIGHT - 2 * Enemy.HEIGHT;
	final Enemy[] enemyPool = {new ShieldBearer(initialEnemyX, initialEnemyY, -1)};

	public Panel() {
		super();
		
		charactersList.add(new ShieldBearer(initialEnemyX, initialEnemyY, -1));
		charactersList.add(new Beheaded(0, 0, 1));
	}

	public void paint(Graphics g) {
		for (Drawable item : charactersList)
			item.paint((Graphics2D) g);
	}

	public void tick() {
		for (Drawable item : charactersList) 
			item.tick();
	}

}
