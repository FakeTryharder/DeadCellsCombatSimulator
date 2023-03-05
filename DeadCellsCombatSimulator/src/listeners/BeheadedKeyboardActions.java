package listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BeheadedKeyboardActions implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + "pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "released");
	}

}
