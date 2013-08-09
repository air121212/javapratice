
public class MyPoliceStation implements MyObserver
{
	public void update(MyObservable o, Object arg) 
	{    
	    Call tele=(Call) o;
		if (arg=="110")
		{System.out.println("Call the police!");
	    System.out.println("The target address is"+tele.getAddress());}	
	}
}
