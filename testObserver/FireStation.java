package testObserver;

import java.util.Observable;
import java.util.Observer;

public class FireStation implements Observer  //�۲���3��������
{  public void update(Observable o,Object arg) 
	{    Call tele=(Call) o;
		if (arg=="119")
		{System.out.println("Report a fire!");
	    System.out.println("The target address is"+tele.getAddress());}
		
	}
}