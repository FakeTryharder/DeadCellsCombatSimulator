package characters;

import java.util.ArrayList;

import effects.GenericEffect;
import graphics.Frame;
import interfaces.Drawable;
/**Generic character class, extended from generic enemy class and The Beheaded class
 * @see Enemy
 * @see Beheaded
*/
public abstract class GenericCharacter implements Drawable {
	protected int x, y;
	private int velocityX, velocityY;
	private ArrayList<GenericEffect> effects;
	public static int WIDTH = 100, HEIGHT = 200; 

	public GenericCharacter(int x, int y, int  velocityX, int velocityY) {
		setX(x);
		setY(y);
		setVelocityX(velocityX);
		setVelocityY(velocityY);
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getVelocityX() {
		return velocityX;
	}

	@Override
	public int getVelocityY() {
		return velocityY;
	}

	@Override
	public void setX(int x) {
		if (x < 0)
			return;
		
		if (x + WIDTH > Frame.WIDTH)
			return;
		
		this.x = x;
	}

	@Override
	public void setY(int y) {
		if (y < 0)
			return;
		
		if (y + HEIGHT > Frame.HEIGHT)
			return;
		
		this.y = y;
	}

	@Override
	public void setVelocityX(int velocityX) {
		this.velocityX = velocityX;
	}

	@Override
	public void setVelocityY(int velocityY) {
		this.velocityY = velocityY;
	}

	@Override
	public void tick() {
		
		setX(x + velocityX);
		setY(y - velocityY);
		
	}
	
	public void applyEffect(GenericEffect effect) {
		
		effects.add(effect);
		
	}
	
	public abstract int baseAttack();
}
