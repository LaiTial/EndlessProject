package Story;

import java.awt.event.*;
import ControllGame.MainScreen;
import ThirdPage.GameMainPanel;

public class MakeClickEvent implements MouseListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int stage = GameMainPanel.getStage();
		StoryPanel story = (StoryPanel) MainScreen.getPanel(stage + 3);
				
		if(story.getI() < story.getLineNumber())
			story.StoryPanel();
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
}
