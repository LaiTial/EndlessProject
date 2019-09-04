package CommonSource;

import java.awt.event.*;
import javax.swing.*;
import ControllGame.MainScreen;
import ThirdPage.MakeRandomButton;

public class GoToButton{
	
	private JButton ArButton[] = null;
	private JButton button = null;
	private ImageClass image;
	private int num;
	
	public GoToButton(int ArrayNumber, int [][]ButtonLocation, ImageClass image)
	{
		ArButton = new JButton[ArrayNumber];
		
		for(int i=0; i < ArrayNumber; i++)
		{
			ArButton[i] = new JButton();
			ArButton[i].setLayout(null);
			setLocation(ButtonLocation[i], ArButton[i]);
			image.add(ArButton[i]);
		}
		num = ArrayNumber;
	}
	
	public GoToButton(int ArrayNumber, int [][]ButtonLocation, ImageClass image, String[] text)
	{
		this(ArrayNumber, ButtonLocation, image);
		
		for(int i=0; i < ArrayNumber; i++)
		{
			ArButton[i].setText(text[i]);
		}
	}
	
	public GoToButton(int ArrayNumber, int [][]ButtonLocation, ImageClass image, Boolean border, Boolean area, String general)
	{
		this(ArrayNumber, ButtonLocation, image);
		
		for(int i=0; i < ArrayNumber; i++)
		{
			setDecorate(false, false, ArButton[i]);
			setButtonImage(general, i, ArButton[i]);
		}
	}
	
	public GoToButton(ImageClass image, Boolean border, Boolean area, String general, int location[], int i)
	{
		button = new JButton();
		
		setButtonImage(general, i, button);
		GoToButton.setDecorate(false, false, button);
		setLocation(location, button);
		image.add(button);
	}
		
	
	public static void setLocation(int[] loca, JButton b)
	{
		b.setBounds(loca[0], loca[1], loca[2], loca[3]);
		
	}
	
	public static int setRandImage(String general, JButton b)
	{
		int i;
		String makeScr;
		i = MakeRandomButton.makeRandNumber();
		
		makeScr = general + i + ".png";

		b.setIcon(new ImageIcon(makeScr));
		
		return i;
	}
	
	public static void setButtonImage(String general, int i, JButton b)
	{
		String makeScr;
		
		makeScr = general + i + ".png";

		b.setIcon(new ImageIcon(makeScr));
	}
	
	public static void setNullButtonImage(JButton b)
	{
		b.setIcon(new ImageIcon(""));
	}
		
	public static void setDecorate(Boolean border, Boolean area, JButton b)
	{
		b.setBorderPainted(border);
		b.setContentAreaFilled(area);
	}
	
	public JButton getButton() {
		return button;
	}


	public void clickEvent(String panelName[])
	{
		ActionListener buttonListener;
		
		for(int i=0; i< num; i++)
		{
			buttonListener = new ConfirmButtonActionListener(ArButton[i], MainScreen.getContain(), MainScreen.getCard(), panelName[i]);
			ArButton[i].addActionListener(buttonListener);
		}
	}
	
	public void clickEvent(String panelName)
	{
		ActionListener buttonListener;
		
		buttonListener = new ConfirmButtonActionListener(button, MainScreen.getContain(), MainScreen.getCard(), panelName);
		button.addActionListener(buttonListener);
	}
}
