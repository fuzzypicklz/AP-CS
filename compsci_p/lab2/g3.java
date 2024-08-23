package lab2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class g3 extends Frame {
	public g3()
	{
	setVisible(true);
	setSize(400, 425);
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
        
        page.setColor(Color.magenta);
        page.fillRect(0, 25, 400, 400);
        for(int x = 0; x<400;x+=50){
            for(int y = 0; y<400; y+=50){
                if (x%100 == 0) {
                    if (y%100 != 0) {
                        page.setColor(Color.black);
                        page.fillRect(x, y+25, 50, 50);
                    }
                }
                if(x%100 != 0){
                    if (y%100 == 0) {
                        page.setColor(Color.black);
                        page.fillRect(x, y+25, 50, 50);
                    }
                }
            }
        }
	}
	public static void main(String[] args)
	{
	new g3();
	}

}
