package testObserver;

import java.util.Observable;

public class Call extends Observable // ���۲��ߣ����е绰
{   String number="000";
	String address="��";
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