package Timmer;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ControllGame.MainScreen;
import ThirdPage.GameMainPanel;
import ThirdPage.Score;

public class GoCard implements MouseListener{
	
	private Container contain;
	private CardLayout card;
	private BlackImage It;
	private int scoreLimit[] = {15, 24, 26, 32, 36};
	
	public GoCard(Container contain, CardLayout card)
	{
		this.contain = contain;
		this.card = card;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		int sec = MakeTimmerTask.getSecond();
		
		if((sec < 1))
		{
			It = (BlackImage) MainScreen.getPanel(3);
			
			if(Score.getScore() >= scoreLimit[GameMainPanel.getStage()])
			{
				It.setGeneral(0);
			}
			
			else
				It.setGeneral(1);
			
			It.BlackTImage();
			
			card.show(contain, "BlackPanel");
		}
	}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

}
