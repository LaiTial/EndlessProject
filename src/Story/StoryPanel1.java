package Story;

public class StoryPanel1 extends StoryPanel{
	
	private static int[] ImageNumber = {10, 10, 12, 12, 18, 21, 21, 23, 21, 23, 22, 17, 22, 17, 22, 21, 22};
	private static int[] howManyLine= {3, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1};
	
	public StoryPanel1()
	{
		super(23, 21, 0, 0, howManyLine, ImageNumber);
		i = 0;
		j = 0;
	}
}
