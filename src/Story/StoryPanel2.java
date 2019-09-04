package Story;

import ControllGame.MainScreen;

public class StoryPanel2 extends StoryPanel{

	private static int[] ImageNumber = {15, 14, 15, 15, 14, 15, 15, 25, 14, 15, 25, 14, 13, 16, 13, 14, 25, 25, 16, 16, 14, 16};
	private static int[] howManyLine= {1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	
	public StoryPanel2()
	{
		super(24, 22, 1, 1, howManyLine, ImageNumber);
		i = 0;
		j = 0;
	}
	
	@Override
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\Story\\JayM.wav", 1);   
	}
}
