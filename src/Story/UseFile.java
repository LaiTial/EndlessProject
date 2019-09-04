package Story;

import java.io.*;
import ThirdPage.GameMainPanel;

public class UseFile {
	
	public static void ReadFile(String src) 
	{
		try {
			FileReader fill = new FileReader(new File(src));
			GameMainPanel.setStage(fill.read());
			fill.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile(String src, int StoreStage) 
	{
		try {
			FileWriter fill = new FileWriter(new File(src));
			fill.write(StoreStage);
			fill.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFileLine(String[] textStory, String src)
	{
        try { 
            String line = ""; 
            BufferedReader br = new BufferedReader(new FileReader(src)); 
            int i = 0;
            
            while((line = br.readLine()) != null) { 
                  textStory[i++] = line;
            } 

            br.close(); 
      } catch (IOException e){ 
            e.printStackTrace(); 
      }
	}
}
