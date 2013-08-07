package testObserver;
import java.util.Observable;
import java.util.Observer;


public class testObserver {
	public static void main(String[] args) {
		Call onecall= new Call(); //初始化被观察者对象
		onecall.addObserver(new PoliceStation()); //添加观察者对象
		onecall.addObserver(new EmergencyCenter());
		onecall.addObserver(new FireStation());
		onecall.calling("110", "南京新街口中央商场");
		onecall.calling("119", "南京湖南路22号");
		onecall.calling("120", "池田路77号");
		
	}

}
