package ThirdPage;

import javax.swing.JButton;

public class ReverseButton extends NeB{

	public ReverseButton(JButton[][] b) {
		super(b);
	}
	
	   public static void rereverse()
	   {
     
		      if(ch != true)
		      {
		         if(sX2 != -1)
		         {
		            CheckButtonTrue.reverseButton(sX1, sY1, sX2, sY2);
		            CheckButtonTrue.store(-1, -1, -1, -1);
		            ch = false;
		         }
		      }
		      
		      else 
		      {
		         ch=false;
		         CheckButtonTrue.store(-1, -1, -1, -1);
		      }     
	   }
	   

}


