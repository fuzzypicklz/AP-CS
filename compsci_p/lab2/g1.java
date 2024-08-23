package lab2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class g1 extends Frame {
	public g1()
	{
	setVisible(true);
	setSize(300, 200);
	addWindowListener(new WindowAdapter()
	{
	@Override
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);
	}
	}
	);
	}
	public void paint(Graphics page) {
	setBackground(Color.cyan);
	page.setColor(Color.blue);
	page.fillRect(0, 150, 300, 50);
	page.setColor(Color.yellow);
	page.fillOval(-10, 0, 50, 50);
	
	page.setColor(Color.white);
    page.fillOval(100, 150, 100, 100);

	page.setColor(Color.white);
    page.fillOval(110, 100, 80, 80);

	page.setColor(Color.white);
    page.fillOval(120, 60, 60, 60);
    page.setColor(Color.black);
    page.fillOval(180, 70, 5, 5);
    page.setColor(Color.black);
    page.fillOval(140, 80, 5, 5);
    
    page.drawArc(140, 90, 20, 10, 190, 160);

	page.drawLine(120, 120, 80, 80);
	page.drawLine(180, 120, 220, 80);

	page.setColor(Color.black);
	page.fillRect(110, 65, 80, 5);

	page.setColor(Color.BLACK);
	page.fillRect(130, 30, 40, 40);

}
	public static void main(String[] args)
	{
	new g1();
	}

}
