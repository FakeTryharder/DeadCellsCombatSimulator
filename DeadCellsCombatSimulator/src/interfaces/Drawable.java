package interfaces;

import java.awt.Graphics2D;

public interface Drawable {

	//getters
	public int getX();
	public int getY();
	
	public int getVelocityX();
	public int getVelocityY();
	
	//setters (boolean for non valid parameters)
	public void setX(int x);
	public void setY(int y);
	
	public void setVelocityX(int velocityX);
	public void setVelocityY(int velocityY);
	
	public void paint(Graphics2D g);
	public void tick();
	
}
