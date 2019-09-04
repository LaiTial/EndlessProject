package SecondPage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class LetterDecoration {
   
   public static void view_setBackground(JLabel text, Color color) {
      text.setBackground(color);//라벨의 배경색 하얀색으로 지정
   }
   public static void view_setOpaque(JLabel text, Boolean bool) {
      text.setOpaque(bool);//라벨을 투명하게 하여 배경색이 보이도록 함
   }
   public static void view_setFont(JLabel text, String type) {
      text.setFont(new Font(type,Font.BOLD,15));//글씨체 조정
   }
   public static void view_setFont(JLabel text, String type, int size) {
      text.setFont(new Font(type,Font.BOLD,size));//글씨체 조정
   }

}