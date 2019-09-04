package ThirdPage;

import javax.swing.*;
import CommonSource.ImageClass;
import SecondPage.LetterDecoration;

public class Score{

   private ImageClass image;
   private JLabel a_score_title= new JLabel("Score: ");
   private static JLabel a_score= new JLabel("0");
   private static int score=0;
   
   public Score(ImageClass image) {
      this.image=image;
      
      LetterDecoration.view_setFont(a_score_title,"HYµø≥ËM",23);
      LetterDecoration.view_setFont(a_score,"HYµø≥ËM",23);
      
      a_score_title.setBounds(500,10,100,50);
      image.add(a_score_title);
      
      a_score.setBounds(580,10,50,50);
      image.add(a_score);
   }
   
   public static int getScore() {
	return score;
}

public static void setScore(int score) {
	Score.score = score;
}

public static void printscore() {
      a_score.setText(Integer.toString(score));
   }
   
}