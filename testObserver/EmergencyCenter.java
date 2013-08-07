package testObserver;

import java.util.Observable;
import java.util.Observer;

public class EmergencyCenter implements Observer  //观察者2：急救中心
{  public void update(Observable o,Object arg) 
	{   Call tele=(Call) o;
		if (arg=="120")
		{System.out.println("Call the emergency center!");
	    System.out.println("The target address is"+tele.getAddress());}
		
	}
}