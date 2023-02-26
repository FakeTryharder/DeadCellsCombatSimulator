package characters;

import java.awt.Color;
import java.awt.Graphics2D;

import weapons.*;

public class Beheaded extends GenericCharacter {

	GenericWeapon weapon;
	
	public Beheaded(int x, int y, int velocityX) {
		super(x, y, velocityX, 0);
	}
	
	@Override
	public void paint(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, WIDTH, 50);

		g.setColor(Color.BLACK);
		g.fillRect(x, y + 50, WIDTH, HEIGHT - 50);
	}

	@Override
	public int baseAttack() {
		// TODO Auto-generated method stub
		return 0;
	}

}
