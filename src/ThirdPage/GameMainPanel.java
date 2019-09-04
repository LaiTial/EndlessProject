package ThirdPage;

import java.awt.BorderLayout;
import javax.swing.*;
import CommonSource.*;
import ControllGame.MainScreen;
import Story.UseFile;
import Timmer.*;

public class GameMainPanel extends JPanel{
	
	private PutImage SeveralIm;
	private int [][]size = {{0, 150, 0},
			{0, -150, 0},
			{1300, 1200, 380},
			{900, 1000, 200}};
	
	private int[] location = {110, 630, 230, 180};
	private int[] stageLocation = {0, 0, 380, 200};
	private ImageClass image;
	private static int stage = 0;
	private MakeRandomButton but;
	private Score score_object;
	private TimerGui t;
	private GoToButton staged, setButton;

	public GameMainPanel()
	{
		BorderLayout bord = new BorderLayout();
		this.setLayout(bord);
		
		SeveralIm = new PutImage(size, "ImageF", "src\\ThirdPage\\");
		image = new ImageClass(SeveralIm.getSrc(), SeveralIm.getX(), SeveralIm.getY(), SeveralIm.getWidth(), SeveralIm.getHeight());

		this.add(image);
	}
	
	public void needRepaint()
	{
		image.removeAll();
		
		if(ConfirmButtonActionListener.getNewd() != true)
			UseFile.ReadFile("src\\Timmer\\Store.txt");
		
		else
			stage = 0;
		
		but = new MakeRandomButton(image);
		
		setButton = new GoToButton(image, false, false, "src\\ThirdPage\\ImageG", location, 0);		
		setButton.clickEvent("mainPanel");
		
		staged = new GoToButton(image, false, false, "src\\ThirdPage\\Stage0", stageLocation, stage);
		
		t = new TimerGui(image);
	    score_object= new Score(image);
	    
	    ConfirmButtonActionListener.setNewd(false);
	    UseFile.writeFile("src\\Timmer\\Store.txt", GameMainPanel.getStage());
	}
	
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\ThirdPage\\Brunch.wav",1);
	}
	
	public static void setStage(int stage) {
		GameMainPanel.stage = stage;
	}

	public static int getStage() {
		return stage;
	}
}

