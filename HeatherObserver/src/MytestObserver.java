
public class MytestObserver 
{
	public static void main(String[] args) 
	{
		Call onecall= new Call(); 
		onecall.addObserver(new MyPoliceStation());
		onecall.addObserver(new MyFireStation());
		onecall.addObserver(new MyEmergencyCenter());
		
		onecall.calling("110", "南京新街口中央商场");
		onecall.calling("119", "南京湖南路22号");
		onecall.calling("120", "池田路77号");
	}
}
