package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import characters.*;
import characters.enemies.*;
import interfaces.*;
import listeners.*;

public class Panel extends JPanel {

	List<GenericCharacter> charactersList = new ArrayList<>();
	int 
		initialEnemyX = Frame.WIDTH - 2 * Enemy.WIDTH, 
		initialEnemyY = Frame.HEIGHT - 2 * Enemy.HEIGHT;
	final Enemy[] enemyPool = {new ShieldBearer(initialEnemyX, initialEnemyY, -1)};

	public Panel() {
		super();
		
		charactersList.add(new ShieldBearer(initialEnemyX, initialEnemyY, -1));
		charactersList.add(new Beheaded(0, 0));
		BeheadedMouseActions.character = (Beheaded) charactersList.get(1);
		addMouseListener(new BeheadedMouseActions());
		
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
