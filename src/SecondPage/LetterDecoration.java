package SecondPage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class LetterDecoration {
   
   public static void view_setBackground(JLabel text, Color color) {
      text.setBackground(color);//���� ���� �Ͼ������ ����
   }
   public static void view_setOpaque(JLabel text, Boolean bool) {
      text.setOpaque(bool);//���� �����ϰ� �Ͽ� ������ ���̵��� ��
   }
   public static void view_setFont(JLabel text, String type) {
      text.setFont(new Font(type,Font.BOLD,15));//�۾�ü ����
   }
   public static void view_setFont(JLabel text, String type, int size) {
      text.setFont(new Font(type,Font.BOLD,size));//�۾�ü ����
   }

}