package ThirdPage;

import java.util.Random;
import javax.swing.*;
import CommonSource.*;

public class MakeRandomButton extends JPanel{
	
	private JButton b[][];
	private ImageClass image;

	public MakeRandomButton(ImageClass image)
	{	
		this.image = image;
		this.setLayout(null);
		
		b = new JButton[9][9];

		for(int i=0; i < 9; i++)
		{
			for(int j=0; j<9; j++)
			{
				b[i][j] = new JButton();
				b[i][j].setBounds(400 + 70*j, 100 + 70*i, 70, 70);
				CheckButtonTrue.getImgXY(GoToButton.setRandImage("src\\ThirdPage\\ImageFood0", b[i][j]), i, j);
				image.add(b[i][j]);
			}
		}
		
		CheckButtonTrue checked = new CheckButtonTrue(b);
		CheckTrue btTru;
		
		for(int i=0; i < 9; i++)
		{
			for(int j=0; j<9; j++)
			{
				btTru = new CheckTrue(b, checked);
				btTru.getXY(i, j);
				b[i][j].addActionListener(btTru);
			}
		}
    
}

	public static int makeRandNumber()
	{
		int number;
		
		Random rand = new Random();
		number = rand.nextInt(10);
		
		return number;
	}
}
