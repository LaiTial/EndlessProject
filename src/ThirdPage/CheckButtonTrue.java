package ThirdPage;

import javax.swing.JButton;
import CommonSource.GoToButton;

public class CheckButtonTrue extends NeB{

	public CheckButtonTrue(JButton b[][])
	{
		super(b);
		
		for(int i=0; i<9; i++)
		{
			for(int j=0;j<9;j++)
			{
				bool[i][j] = false;
			}
		}
	}
	
	public static void checkch(int at, int bt)
	{
		int count;
		count = getCount();
		
			if(count==2) {
				for(int i=0; i<9;i++) {
					for(int j=0; j<9;j++) {
						if(i !=0)
						{
							if((bool[i-1][j]==true)&&(bool[i][j]==true)) {
								store(i, j, i-1, j);
								count = reverseButton(i, j, i-1, j, count);
							}
						}
						
						if(i !=8)
						{
							if((bool[i+1][j]==true)&&(bool[i][j]==true)) {
								store(i, j, i+1, j);
								count = reverseButton(i, j, i+1, j, count);
							}
						}
						
						if(j !=0)
						{
							if((bool[i][j-1]==true)&&(bool[i][j]==true)) {
								store(i, j, i, j-1);
								count = reverseButton(i, j, i, j-1, count);
							}
						}
					
						if(j !=8)
						{
							if((bool[i][j+1]==true)&&(bool[i][j]==true)) {
								store(i, j, i, j+1);
								count = reverseButton(i, j, i, j+1, count);
							}
						}
				
					}
				}
				
				
					if((xTemp != -1) && (yTemp != -1) )
					{
						b[at][bt].setBackground(null);
						b[xTemp][yTemp].setBackground(null);
						reverseFalse(at, bt, xTemp, yTemp);
						xTemp = -1;
						yTemp = -1;
					}
				
			}
			else {
				
					xTemp = at;
					yTemp = bt;
			}
	}
	
	
	public static int reverseButton(int i, int j, int Ri, int Rj, int count)
	{
			reverseButton(i, j, Ri, Rj);
			reverseFalse(i, j, Ri, Rj);
			count = 0;
			b[i][j].setBackground(null);
			b[Ri][Rj].setBackground(null);
		
		return count;
	}
	
	public static void reverseButton(int i, int j, int Ri, int Rj)
	{
			GoToButton.setButtonImage("src\\ThirdPage\\ImageFood0", location[Ri][Rj], b[i][j]);
			GoToButton.setButtonImage("src\\ThirdPage\\ImageFood0", location[i][j], b[Ri][Rj]);
			reverseReturn(i, j, Ri, Rj);
	}
	
	public static void reverseFalse(int i, int j, int Ri, int Rj)
	{
		bool[Ri][Rj]=false; 
		bool[i][j]=false;
	}
	
	public static int getCount()
	{
		int count=0;
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				if(bool[i][j]==true) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static Boolean[][] getBool() {
		return bool;
	}
	
	public static void store(int Ri, int Rj, int i, int j)
	{
		sX1 = Ri;
		sY1 = Rj;
		sX2 = i;
		sY2 = j;
	}

}