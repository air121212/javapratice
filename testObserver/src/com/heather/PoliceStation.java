package com.heather;

import java.util.Observable;
import java.util.Observer;

public class PoliceStation implements Observer  // �۲���1�������
{ 
	@Override
	public void update(Observable o, Object arg) //����ʡ��public����Ϊ���ʿ����ַ�Ȩ�޲���С�ڸ���
	{    
	    Call tele=(Call) o;
		if (arg=="110")
		{System.out.println("Call the police!");
	    System.out.println("The target address is"+tele.getAddress());}
		
	}
}