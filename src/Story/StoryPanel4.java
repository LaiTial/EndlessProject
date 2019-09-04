package Story;

import ControllGame.MainScreen;

public class StoryPanel4 extends StoryPanel{
	
	private static int[] ImageNumber = {24, 24, 19, 19, 19, 21, 25, 17, 25, 17, 18, 17, 25, 21, 18, 17, 18, 21, 25, 21, 18, 18, 17, 18, 24};
	private static int[] howManyLine= {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2};
	
	public StoryPanel4()
	{
		super(32, 25, 2, 3, howManyLine, ImageNumber);
		i = 0;
		j = 0;
	}
	
	@Override
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\Story\\SummerPicnic.wav", 1);   
	}
}
