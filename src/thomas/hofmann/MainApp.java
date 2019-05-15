package thomas.hofmann;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MainApp implements ContextInterface {
	int x, y;

	public static void main(String[] args) {
		// Creating a new Object of this Class
		// since the ContextPane can't be accessed via a static function
		new MainApp().init();
	}

	void init() {
		// Creating the Window in which the ContextPane should
		// display the drawn stuff
		Window main = new Window("CodeExample", 1000, 600, true);
		ContextPane ge = new ContextPane(main, this);
		// Start the execution of the loop function
		ge.start();
	}

	@Override
	public void draw(Graphics2D g) {
		// Coordinate system starts at top left
		// Draws a Rectangle at the location of the mouse
		g.fillRect(x, y, 100, 100);
	}

	@Override
	public void drawRev(Graphics2D g) {
		// Coordinate system starts at bottom left
	}

	@Override
	public void loop(ContextPane ge) {
		// Redraws the whole screen
		ge.redraw();
		// Caps the frame rate at 60 frames per second
		ge.capFrameRate(60);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// If the mouse moved, update x and y position
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Writes 'pressed' to the console every time
		// a mouse button was pressed
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}
}