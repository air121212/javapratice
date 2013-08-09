import java.util.ArrayList;

public class MyObservable 
{
	int flag;
	ArrayList<MyObserver> mylist;
	
	MyObservable()
   { 
		flag=0;
		mylist=new ArrayList<MyObserver>();
	}
		
	void addObserver(MyObserver o)
	{
		mylist.add(o);
	}
		
	public int setChanged()
	{
		return flag=1;
	}
		
	public void notifyObservers(Object arg)
	{    int i=0;
		if (flag==1)
		{
		   for(i=0;i<mylist.size();i++)
		 {	
			MyObserver o=mylist.get(i);
			o.update(this,arg);
		 }
		}
	}
}

