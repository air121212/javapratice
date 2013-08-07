package testObserver;

import java.util.Observable;

public class Call extends Observable // 被观察者：呼叫电话
{   String number="000";
	String address="无";
	void calling(String a,String b)
	{ number=a;
	 address=b;
	  setChanged();
	  notifyObservers(number);
	}
	 
	public String getNum()            
	{return number;}
	
	public String getAddress()
	{return address;}
	
}