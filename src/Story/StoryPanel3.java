package Story;

import ControllGame.MainScreen;

public class StoryPanel3 extends StoryPanel{
	
	private static int[] ImageNumber = {17, 19, 18, 21, 11, 21, 12, 12, 12, 12, 23, 21, 23};
	private static int[] howManyLine= {2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1};
	
	public StoryPanel3()
	{
		super(15, 13, 0, 2, howManyLine, ImageNumber);
		i = 0;
		j = 0;
	}
	
	@Override
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\Story\\DeemoFluquor.wav", 1);   
	}
}

