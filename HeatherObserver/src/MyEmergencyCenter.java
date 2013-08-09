
public class MyEmergencyCenter implements MyObserver
{
	public void update(MyObservable o,Object arg) 
	{ 
	    Call tele=(Call) o;
		if (arg=="120")
		{
			System.out.println("Call the emergency center!");
			System.out.println("The target address is" + tele.getAddress());
	    }
	}
}
