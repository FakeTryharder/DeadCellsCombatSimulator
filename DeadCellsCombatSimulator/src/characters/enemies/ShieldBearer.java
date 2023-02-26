package characters.enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import characters.Enemy;

/**
 * Purple zombie holding shield, collision can be considered a rectangle
*/
public class ShieldBearer extends Enemy {

	private static final Color MOBCOLOR = Color.getHSBColor(173, 240, 170);
	private long lastSpecialUse;
	private final long specialCooldown = 2000;
	private static int baseSpeed = 1;
	private int direction;
	private final int MAX_DAMAGE = 27, MIN_DAMAGE = 17;
	public int MaxHP = 150;
	
	public ShieldBearer(int x, int y, int direction) {
		super(x, y, baseSpeed * direction);
		this.direction = direction;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public int baseAttack() {
		//shieldbearer sits there menacingly without attacking
		if(lastSpecialUse % specialCooldown == 0)
			specialAttack();
		return 0;
	}

	@Override
	public int specialAttack() {
		lastSpecialUse = System.currentTimeMillis();
		
		setVelocityX(baseSpeed * 4 * direction);
		return (int)(Math.random() * (MAX_DAMAGE - MIN_DAMAGE) + MIN_DAMAGE);
	}
	
	public void resetSpeed() {
		setVelocityX(baseSpeed * direction);
	}
	
	@Override
	public void paint(Graphics2D g) {
		g.setColor(MOBCOLOR);
		g.fillRect(x, y, 100, 200);
	}

}
