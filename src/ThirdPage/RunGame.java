package ThirdPage;

import javax.swing.JButton;
import CommonSource.GoToButton;

public class RunGame extends NeB{
	
	enum Direction {Hline, Vline}

	public RunGame(JButton[][] b) {
		super(b);
	}

	public static void checkThree()
	{
		int Vnum, Hnum;
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				
				Vnum = FindNumber(i, j, Direction.Vline);
				
				if(Vnum >= 3)
				{
					Score.setScore(Score.getScore() + Vnum);
					setNullImage(i, j, Vnum, Direction.Vline);			
					ComeDownImage(i, j, Vnum);
					Vnum = 0;
				
					ch=true;
				}	
				
				Hnum = FindNumber(i, j, Direction.Hline);
				
				if(Hnum >=3)
				{
					Score.setScore(Score.getScore() + Hnum);

					setNullImage(i, j, Hnum, Direction.Hline);
					
					for(int s = j; s <= j+Hnum-1; s++)
					{
						ComeDownImage(i, s, 1);
					}
					Hnum = 0;
					ch=true;

				}	
			}
		}
		
		}
	
	public static void setNullImage(int i, int j, int num, Direction direct)
	{		
		if(direct == Direction.Vline)
		{
			for(int t=i; t < i + num; t++)
			{
				GoToButton.setNullButtonImage(b[t][j]);
			}
		}
		
		else
		{
			for(int t=j; t < j + num; t++)
			{
				GoToButton.setNullButtonImage(b[i][t]);
			}
		}
	}
	
	public static int FindNumber(int i, int j, Direction direct)
	{
		int num = 1;
		
		if(direct == Direction.Vline)
		{
			for(int t = i; t < 8; t++)
			{
				if(location[t][j] == location[t+1][j])
				{
						num++;
				}
					
				else
					break;
			}
		}
		
		else
		{
			for(int z = j; z < 8; z++)
			{
				if(location[i][z] == location[i][z+1])
				{
					num++;
				}
					
				else
					break;
			}
		}
		return num;
		
	}
	
	public static void ComeDownImage(int i, int j, int num)
	{
		int temp;
		
		for(int t= i+num-1; t >= num; t--)
		{	
			GoToButton.setButtonImage("src\\ThirdPage\\ImageFood0", location[t-num][j], b[t][j]);
			location[t][j] = location[t-num][j];
			
			repaintMethod();
		}
		
		for(int t = num-1; t >=0; t--)
		{
			temp = GoToButton.setRandImage("src\\ThirdPage\\ImageFood0", b[t][j]);
			location[t][j] = temp;
			
			repaintMethod();
		}
	}
	
	public static void repaintMethod()
	{
		for(int i=0; i<9;i++) {
			
			for(int j=0;j<9;j++) {
				
				b[i][j].repaint();
			}
		}
	}
}
