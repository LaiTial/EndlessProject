package SecondPage;

import java.awt.*;
import javax.swing.*;
import CommonSource.*;

public class SecondMainPanel extends JPanel {
	
	private PutImage SeveralIm;
	private int [][]size = {{240, 110},
			{40, -40},
			{800, 400},
			{800, 400}};
	private int[][] ButtonLocation = {{330, 670, 130, 80},
			{700, 600, 200, 220}};
	private String[] src = {
			"mainPanel",
			"gamePanel"
	};
	
	public SecondMainPanel()
	{
		BorderLayout bord = new BorderLayout();
		this.setLayout(bord);
		
		SeveralIm = new PutImage(size, "ImageEx0", "src\\SecondPage\\");
		ImageClass image = new ImageClass(SeveralIm.getSrc(), SeveralIm.getX(), SeveralIm.getY(), SeveralIm.getWidth(), SeveralIm.getHeight());
		
		GoToButton setButton = new GoToButton(2, ButtonLocation, image, false, false, "src\\SecondPage\\ImageEx1");		
		setButton.clickEvent(src);
		
		ExplainGame texta = new ExplainGame(image, "게임 방법", 480, 100, 200, 200, "HY동녘M", 40);
		ExplainGame labels = new ExplainGame(10, image, "src\\SecondPage\\GameWay.txt", 320, 130, 600, 300);
		
		this.add(image);
	}
}

