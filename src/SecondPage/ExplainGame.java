package SecondPage;

import java.awt.*;
import javax.swing.*;
import CommonSource.ImageClass;
import Story.UseFile;

public class ExplainGame {
	
	private JLabel[] label;
	private JLabel texta;
	private String[] GameWay;
	private int ArrayNumber;
	
	public ExplainGame(int ArrayNumber, ImageClass image, String src, int x, int y, int width, int height)
	{
		label = new JLabel[ArrayNumber];
		GameWay = new String[ArrayNumber];
		this.ArrayNumber = ArrayNumber;
		
		MakeText(src);
		textLocation(x, y, width, height, 40);
		setFont();
		
		for(int i=0; i < label.length; i++)
		{
			image.add(label[i]);
		}
	}
	
	public ExplainGame(int ArrayNumber, ImageClass image, int x, int y, int width, int height, int size, String Game[], int start)
	{
		label = new JLabel[ArrayNumber];
		this.ArrayNumber = ArrayNumber;
		this.GameWay = Game;
		
		MakeText(Game, start);
		textLocation(x, y, width, height, size);
		setFont();
		
		for(int i=start; i < start + label.length; i++)
		{
			image.add(label[i-start]);
		}
	}
	
	public ExplainGame(ImageClass image, String text, int x, int y, int width, int height, String type, int size)
	{
		texta = new JLabel();
		
		LetterDecoration.view_setFont(texta, type, size);
		texta.setText(text);
		texta.setBounds(x, y, width, height);
		
		image.add(texta);
	}
	
	public void MakeText(String src)
	{
		UseFile file = new UseFile();
		file.readFileLine(GameWay, src);
		
		for(int i = 0; i < ArrayNumber; i++)
		{
			label[i]= new JLabel();
			label[i].setText(GameWay[i]);
		}
	}
	
	public void MakeText(String[] Game, int start)
	{
		for(int i = start; i < start + ArrayNumber; i++)
		{
			label[i-start]= new JLabel();
			label[i-start].setText(Game[i]);
		}
	}
	
	public void textLocation(int x, int y, int width, int height, int size)
	{
		for(int i=0; i<ArrayNumber; i++)
		{
			label[i].setBounds(x, y + size*i, width, height);
		}
	}
	
	public void setFont()
	{
		for(int i=0; i< ArrayNumber; i++)
		{
			LetterDecoration.view_setFont(label[i], "HY엽서M");
		}
		
		if(ArrayNumber > 9)
			label[9].setForeground(Color.red);//마지막 글씨는 빨간색으로 지정.
	}
}
