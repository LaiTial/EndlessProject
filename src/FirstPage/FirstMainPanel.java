package FirstPage;

import java.awt.*;
import javax.swing.*;
import CommonSource.*;
import ControllGame.MainScreen;

public class FirstMainPanel extends JPanel{

	private PutImage SeveralIm;
	private int [][]size = {{0, 50, 200, 50},
			{0, 360, 530, 200},
			{1300, 230, 300, 600},
			{900, 500, 330, 100}};
	
	private String[] text = {
			"새로하기",
				"이어하기",
				"게임방법"
	};
	
	private int[][] ButtonLocation = {{900, 650, 120, 35},
			{900, 710, 120, 35},
			{1050, 680, 120, 35}
	};
	
	private String[] src = {
			"gamePanel",
			"gamePanel",
			"sPanel"
	};

	public FirstMainPanel()
	{	
		BorderLayout bord = new BorderLayout();
		this.setLayout(bord);
				
		SeveralIm = new PutImage(size, "Image0", "src\\FirstPage\\");
		ImageClass image = new ImageClass(SeveralIm.getSrc(), SeveralIm.getX(), SeveralIm.getY(), SeveralIm.getWidth(), SeveralIm.getHeight());
		
		GoToButton setButton = new GoToButton(3, ButtonLocation, image, text);
		setButton.clickEvent(src);
		this.add(image);
		
		playMusic();
	}
	
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\FirstPage\\SummerDream.wav", 1);   
	}
}