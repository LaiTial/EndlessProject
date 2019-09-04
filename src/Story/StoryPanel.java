package Story;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import CommonSource.*;
import ControllGame.MainScreen;
import SecondPage.ExplainGame;
import ThirdPage.GameMainPanel;

public class StoryPanel extends JPanel{
	
	protected PutImage SeveralIm;
	protected ImageClass image;
	protected int [][]size = {{0},
			{0},
			{1300},
			{900}};
	protected int[] ImageLocation = {300, 200, 500, 700}, TextFieldLocation = {0, 600, 1300, 300};
	protected String[] textStory, textCharacter;
	protected GoToButton needImage, setButtonMain, setButtonNext, textField;
	UseFile file = new UseFile();
	protected int[] NextLocation = {1070, 700, 180, 180}, MainLocation = {70, 700, 180, 180};
	protected MakeClickEvent card;
	protected int i = 0, j = 0;
	protected ExplainGame labels, textCh;
	protected int[] ImageNumber, howManyLine;
	protected int LineNumber;
	
	public StoryPanel(int sizeText, int sizeCharc, int ImageSize, int chooseText, int[] howManyLine, int[] ImageNumber)
	{
		BorderLayout bord = new BorderLayout();
		this.setLayout(bord);
		
		SeveralIm = new PutImage(size, "ImageBackground" + ImageSize, "src\\Story\\");
		image = new ImageClass(SeveralIm.getSrc(), SeveralIm.getX(), SeveralIm.getY(), SeveralIm.getWidth(), SeveralIm.getHeight());
		this.add(image);
		
		this.LineNumber = sizeText;
		textStory = new String[sizeText];
		textCharacter = new String[sizeCharc];
		this.howManyLine = howManyLine;
		this.ImageNumber = ImageNumber;
		
		file.readFileLine(textStory, "src\\Story\\story0" + chooseText + ".txt");
		file.readFileLine(textCharacter, "src\\Story\\StudentName0" + chooseText + ".txt");
		
		card = new MakeClickEvent();
		image.addMouseListener(card);
	}
	
	public void StoryPanel()
	{
		image.removeAll();
		
		textCh = new ExplainGame(image, textCharacter[j], 320, 533, 600, 300, "HY¿±¼­M", 15);
		labels = new ExplainGame(howManyLine[j], image, 310, 580, 600, 300, 25, textStory, i);
		i += howManyLine[j];
		
		if(i >= LineNumber)
			geNextPage();
		
		textField = new GoToButton(image, false, false, "src\\Story\\ImageTextField0",TextFieldLocation, 0);
		needImage = new GoToButton(image, false, false, "src\\Story\\ImageCharacter0", ImageLocation, ImageNumber[j++]);
		
		textField.getButton().addMouseListener(card);
		needImage.getButton().addMouseListener(card);
		
		image.repaint();
		
		if(GameMainPanel.getStage() >= 5)
 			UseFile.writeFile("src\\Timmer\\Store.txt", GameMainPanel.getStage()-1);
	}
	
	public void setIJ()
	{
		this.i = 0;
		this.j = 0;
	}
	
	public int getI()
	{
		return i;
	}

	public void geNextPage()
	{
		setButtonMain = new GoToButton(image, false, false, "src\\Story\\GoToNext0",MainLocation, 0);	
	    setButtonMain.clickEvent("mainPanel");
	    
	    if(GameMainPanel.getStage() < 5)
	    {
		    setButtonNext = new GoToButton(image, false, false, "src\\Story\\GoToNext0",NextLocation, 1);
		    setButtonNext.clickEvent("gamePanel");
	    }	    	
	}
	
	public void playMusic()
	{
		MainScreen.getMiniaudio().playMusic("src\\Story\\DeemoWalkingByTheSea.wav", 1);   
	}
	
	public int getLineNumber() {
		return LineNumber;
	}

}
