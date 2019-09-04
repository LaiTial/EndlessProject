package Audioaudio;

import java.io.File;
import javax.sound.sampled.*;

public class Audio {

	private static Clip clip;
   
   public static void playMusic(String musicname, int a)  {
       File f = new File(musicname);
      
       try {
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
         clip = AudioSystem.getClip();
          clip.open(audioIn);
          if(a==1) {
          clip.loop(Clip.LOOP_CONTINUOUSLY);
          }
          else {
             clip.start();
          }
       } 
          catch (Exception e) {
          e.printStackTrace();
      }
   }
   
   public static void musicStop() {
      clip.close();
   }
}