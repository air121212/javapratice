package testObserver;
import java.util.Observable;
import java.util.Observer;


public class testObserver {
	public static void main(String[] args) {
		Call onecall= new Call(); //��ʼ�����۲��߶���
		onecall.addObserver(new PoliceStation()); //��ӹ۲��߶���
		onecall.addObserver(new EmergencyCenter());
		onecall.addObserver(new FireStation());
		onecall.calling("110", "�Ͼ��½ֿ������̳�");
		onecall.calling("119", "�Ͼ�����·22��");
		onecall.calling("120", "����·77��");
		
	}

}
