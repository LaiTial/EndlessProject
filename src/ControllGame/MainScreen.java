package ControllGame;

import java.awt.*;
import javax.swing.*;
import Audioaudio.Audio;
import FirstPage.FirstMainPanel;
import SecondPage.SecondMainPanel;
import Story.*;
import ThirdPage.GameMainPanel;
import Timmer.BlackImage;

public class MainScreen extends JFrame{
   
   private static JPanel[] panel;
   private static Container contain;
   private static CardLayout card;
   private static Audio miniaudio= new Audio();
   private String[] panelName = {
		   "mainPanel",
		   "sPanel",
		   "gamePanel",
		   "BlackPanel",
		   "storyPanel1",
		   "storyPanel2",
		   "storyPanel3",
		   "storyPanel4",
		   "storyPanel5"
   };
   
   public MainScreen()
   {
      contain = this.getContentPane();
      
      card = new CardLayout();
      this.setLayout(card);
      
      panel = new JPanel[9];
    		  
      panel[0] = new FirstMainPanel();
      panel[1] = new SecondMainPanel();
      panel[2] = new GameMainPanel();
      panel[3] = new BlackImage();
      panel[4] = new StoryPanel1();
      panel[5] = new StoryPanel2();
      panel[6] = new StoryPanel3();
      panel[7] = new StoryPanel4();
      panel[8] = new StoryPanel5();
      
      for(int i = 0; i < 9; i++)
      {
          contain.add(panel[i]);
          card.addLayoutComponent(panel[i], panelName[i]);
      }
      
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Â¦»ç¶û °í¹é ´ëÀÛÀü!");
      setSize(1300, 900);
      setResizable(false);
   }   

   public static JPanel getPanel(int i) {
	return panel[i];
   }

   public static Audio getMiniaudio() {
      return miniaudio;
   }

   
   public static Container getContain() {
      return contain;
   }


   public static CardLayout getCard() {
      return card;
   }


   public static void main(String[] args) {

      MainScreen mc = new MainScreen();
   }

}