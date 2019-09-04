package Timmer;

import java.util.Timer;
import CommonSource.ImageClass;
import ControllGame.MainScreen;
import ThirdPage.*;

public class TimerGui {
	
	static ImageClass image;
		
	public TimerGui(ImageClass image)
	{
		MakeTimmerTask task = new MakeTimmerTask();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 1000);
		
		this.image = image;
		TimeBar texta = new TimeBar(image, 140, 600);
	
		GoCard card;
		card = new GoCard(MainScreen.getContain(), MainScreen.getCard());
		image.addMouseListener(card);

		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				NeB.getB()[i][j].addMouseListener(card);
	}

	public static void MakeLabel(int second)
	{	
		RunGame.checkThree();
		
		int time = 60 - MakeTimmerTask.getSecond();
		TimeBar.repaint(image, 140 + 10*time, 600 - 10*time);
		Score.printscore();
	}
}
