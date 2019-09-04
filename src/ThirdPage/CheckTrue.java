package ThirdPage;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;

public class CheckTrue implements ActionListener{
	
	private int x, y;
	private Boolean[][] bt;
	private JButton b[][];
	private CheckButtonTrue checked;
	
	public CheckTrue(JButton b[][], CheckButtonTrue checked)
	{
		this.b = b;
		this.checked = checked;
	}
	
	public void getXY(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		this.bt = CheckButtonTrue.getBool();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bt[x][y] = true;
		b[x][y].setBackground(Color.black);
		CheckButtonTrue.checkch(x, y);
		RunGame.checkThree();
		ReverseButton.rereverse();
	}
}
