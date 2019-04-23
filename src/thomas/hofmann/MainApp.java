package thomas.hofmann;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class MainApp implements Engine
{
	int x,y;
	int width,height;
	public static void main(String[] args)
	{
		//Creating a new Object of this Class
		//since the whole Engine can't be accessed via a static function
		new MainApp().init();
	}
	
	void init()
	{
		//Creating the Window in which the GraphicsEngine should
		//display the drawn stuff
		Window main = new Window("CodeExample", 1000, 600, true);
		//Creating the a Graphics Engine giving it the Window it should display on
		//and the class that contains the draw, loop, keyPress, etc. functions
		GraphicsEngine ge = new GraphicsEngine(main, this);
		//Starts a Thread which runs the loop function
		ge.start();
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		//If the mouse moved:update location of the Rectangle
		x=e.getX();
		//Since the coordinate system is flipped, the y axis has to be flipped to
		y=-e.getY()+this.height;
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		//Writes 'pressed' to the console every time
		//a mouse button was pressed
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}

	@Override
	public void draw(Graphics2D g)
	{
		//Draws a Rectangle at the location of the mouse
		g.fillRect(x, y, 100, 100);
	}

	@Override
	public void loop(GraphicsEngine ge)
	{
		//Updates the width and height to calculate the mouse-path
		this.width=ge.width;
		this.height=ge.height;
		//Redraws the whole screen
		ge.redraw();
		//Caps the frame rate at 60 fps 
		ge.capFrameRate(60);
	}
}
