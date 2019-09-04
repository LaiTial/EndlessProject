package CommonSource;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import ControllGame.MainScreen;
import FirstPage.FirstMainPanel;
import Story.*;
import ThirdPage.*;
import Timmer.MakeTimmerTask;

public class ConfirmButtonActionListener implements ActionListener {
	
	private JButton button;
	private CardLayout card;
	private Container contain;
	private String name = null;
	private GameMainPanel game;
	private FirstMainPanel mainpage;
	private StoryPanel story[] = new StoryPanel[5];
	private static Boolean newd = false;
	
	public ConfirmButtonActionListener(JButton button, Container contain, CardLayout card, String name)
	{
		this.button = button;
		this.contain = contain;
		this.card = card;
		this.name = name;
	}
	
	public static Boolean getNewd() {
		return newd;
	}
	
	public static void setNewd(Boolean bol) {
		newd = bol;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Score.setScore(0);
		MakeTimmerTask.setSecond(60);
		MakeTimmerTask.MakeCancel(true);
		game = (GameMainPanel) MainScreen.getPanel(2);
		mainpage = (FirstMainPanel) MainScreen.getPanel(0);
		story[0] = (StoryPanel1) MainScreen.getPanel(4);
		story[1] = (StoryPanel2) MainScreen.getPanel(5);
		story[2] = (StoryPanel3) MainScreen.getPanel(6);
		story[3] = (StoryPanel4) MainScreen.getPanel(7);
		story[4] = (StoryPanel5) MainScreen.getPanel(8);
		
		if(button.getText().equals("새로하기"))
			newd = true;
				
        doPanel();
		
		game.needRepaint();
		
		if(name != null)
			card.show(contain, name);
		
		else
			card.next(contain);
	}
	
	public void doPanel()
	{
		if(!name.equals("sPanel"))
			MainScreen.getMiniaudio().musicStop();
		
	      if(name != null) 
	      {
	          if(name.equals("gamePanel")) 
	          {
	             MakeTimmerTask.MakeCancel(false);           
	             game.playMusic();
	          }
	          
	          else if(name.equals("mainPanel"))
	          {
	        	  mainpage.playMusic();
	          }
	          
	          for(int i = 0; i < 5; i++)
	          	if(name.equals("storyPanel" + (i+1)))
	          	{
	        	  story[i].setIJ();
	        	  story[i].playMusic();
	        	  story[i].StoryPanel();
	        	  
	      		  GameMainPanel.setStage(GameMainPanel.getStage() + 1);
	      		  UseFile.writeFile("src\\Timmer\\Store.txt", GameMainPanel.getStage());
	          	}
	      }
	}
}