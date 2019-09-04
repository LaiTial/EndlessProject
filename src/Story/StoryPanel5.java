package Story;

import ControllGame.MainScreen;

public class StoryPanel5 extends StoryPanel{
	
	private static int[] ImageNumber = {10, 23, 17, 23, 17, 22, 17, 22, 0, 26, 20, 20, 20, 20, 20, 20, 18, 20, 20, 18, 20, 24, 17, 22, 17, 27, 17, 17};
	private static int[] howManyLine= {2, 1, 1, 2, 1, 1, 3, 1, 3, 2, 1, 3, 1, 1, 2, 1, 3, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1};
	
	public StoryPanel5()
	{
		super(43, 28, 3, 4, howManyLine, ImageNumber);
		i = 0;
		j = 0;
	}
	
	@Override
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\Story\\Morning.wav", 1);   
	}
}
