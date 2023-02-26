package characters;

/**
 * Generic enemy class, to be extended from enemy-specific classes
 * @see GenericCharacter
*/
public abstract class Enemy extends GenericCharacter {
	
	public Enemy(int x, int y, int  velocityX) {
		super(x, y, velocityX, 0);
	}
	
	public abstract int specialAttack();
	
}
