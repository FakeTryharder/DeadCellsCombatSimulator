package characters;

import java.awt.Color;
import java.awt.Graphics2D;

import weapons.*;

public class Beheaded extends GenericCharacter {

	GenericWeapon weapon;
	public static boolean isAttacking, isBlocking;
	public static int HP, MaxHP;
	
	public Beheaded(int x, int y) {
		super(x, y, 0, 0);
		HP = 100;
		MaxHP = 100;
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
		return weapon.attack();
	}

}
