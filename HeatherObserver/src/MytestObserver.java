
public class MytestObserver 
{
	public static void main(String[] args) 
	{
		Call onecall= new Call(); 
		onecall.addObserver(new MyPoliceStation());
		onecall.addObserver(new MyFireStation());
		onecall.addObserver(new MyEmergencyCenter());
		
		onecall.calling("110", "�Ͼ��½ֿ������̳�");
		onecall.calling("119", "�Ͼ�����·22��");
		onecall.calling("120", "����·77��");
	}
}
