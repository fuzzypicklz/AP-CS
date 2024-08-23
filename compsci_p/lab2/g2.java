package lab2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class g2 extends Frame {
	public g2()
	{
	setVisible(true);
	setSize(500, 500);
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
	public void paint (Graphics page)
	{
		int num = 300;
	while (num>=100){
		
		page.setColor(Color.black);
		page.fillOval(250-num/2, 250-num/2, num, num);
		num-=50;
		page.setColor(Color.white);
		page.fillOval(250-num/2, 250-num/2, num, num);
		num-=50;
		
	}
	page.setColor(Color.red);
	num+=50;
		page.fillOval(250-num/2, 250-num/2, num, num);
	
	}
	public static void main(String[] args)
	{
	new g2();
	}

}
