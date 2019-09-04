package ThirdPage;

import javax.swing.JButton;

public class NeB {
	
	static Boolean [][] bool = new Boolean[9][9];
	
	protected static Boolean ch = false;
	protected static int xTemp = -1;
	protected static int yTemp = -1;
	protected static int sX1 = -1, sX2 = -1, sY1 = -1, sY2 = -1;
	
	protected static JButton b[][];
	protected static int location[][] = new int[9][9];
	
	public NeB(JButton b[][])
	{
		NeB.b = b;
	}
	
	public static void reverseReturn(int i, int j, int Ri, int Rj)
	{
		int temp;
		
		temp = location[i][j];
		location[i][j] = location[Ri][Rj];
		location[Ri][Rj] = temp;
	}

	public static void getImgXY(int i, int x, int y)
	{
		location[x][y] = i;
	}
	
	public static JButton[][] getB() {
		return b;
	}	
}
