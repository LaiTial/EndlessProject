package Timmer;

import java.awt.*;
import javax.swing.*;
import CommonSource.*;
import ThirdPage.*;

public class BlackImage extends JPanel{
	
	private PutImage SeveralIm;
	private int [][]size = {{0},
			{0},
			{1300},
			{900}};
	private int general;
	private ImageClass image;
	private int[] location = {510, 430, 430, 120};
	private int[] stageLocation = {460, 150, 500, 200};
	private GoToButton staged, setButton;

	public BlackImage()
	{
		BorderLayout bord = new BorderLayout();
		this.setLayout(bord);
		
		SeveralIm = new PutImage(size, "ImageFra0", "src\\Timmer\\");
		image = new ImageClass(SeveralIm.getSrc(), SeveralIm.getX(), SeveralIm.getY(), SeveralIm.getWidth(), SeveralIm.getHeight());
		
		this.add(image);	
	}
		
	public void BlackTImage()
	{
		image.removeAll();
		
		staged = new GoToButton(image, false, false, "src\\Timmer\\Text0", stageLocation, general);	
		setButton = new GoToButton(image, false, false, "src\\Timmer\\ImageG", location, 0);		
		
		store();
	}
	
	public void setGeneral(int g) {
		general = g;
	}
	
	public void store()
	{
		if(general == 0)
			setButton.clickEvent("storyPanel" + (GameMainPanel.getStage()+1));
		
		else
			setButton.clickEvent("gamePanel");
	}
}
