package listeners;

import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import characters.Beheaded;

public class BeheadedMouseActions implements MouseListener {
	public static Beheaded character;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

		switch (e.getButton()) {
		case 1:
			if (!Beheaded.isBlocking)
				Beheaded.isAttacking = true;
		case 3:
			if (!Beheaded.isAttacking)
				Beheaded.isBlocking = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
