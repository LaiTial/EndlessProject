package Timmer;

import java.util.TimerTask;
import CommonSource.ImageClass;

public class MakeTimmerTask extends TimerTask{

	private static int second = 60;
	private int minute = 1;
	private String time;
	private ImageClass image;
	private static Boolean Cancel;
	
	@Override
	public void run() 
	{
		if(Cancel)
			cancel();
		
		second--;
		
		TimerGui.MakeLabel(second);
		
		if(second < 1)
			cancel();
		
	}

	public static void setSecond(int second) {
		MakeTimmerTask.second = second;
	}
	
	public static int getSecond() {
		return second;
	}
	
	public static void MakeCancel(Boolean t)
	{
		Cancel = t;
	}
}
