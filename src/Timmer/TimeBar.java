package Timmer;

import java.awt.*;
import javax.swing.JPanel;
import CommonSource.ImageClass;

public class TimeBar extends JPanel{
	
	private GradientPaint Bar;
	private ImageClass image = null;
	private static int y, height;
	
	public TimeBar(ImageClass image, int y, int height)
	{
		this.image = image;
		this.setSize(500, 1300);
		
		this.y = y;
		this.height = height;
		
		image.add(this);
	}
	
	public static void repaint(ImageClass image, int yN, int Nheight)
	{
		y = yN;
		height = Nheight;
		
		image.repaint();
	}
	
	public JPanel returnPanel()
	{
		return this;
	}
	
	public void paintComponent(Graphics g)
	{
		GradientPaint gPaint1=new GradientPaint(360, y, Color.CYAN, 380, y+height, Color.pink);
		Graphics2D g2=(Graphics2D)g;
		
		g2.setPaint(gPaint1);
		g2.drawRect(360, y, 20, height);
		g2.fillRect(360, y, 20, height);
	}

}
