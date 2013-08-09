package com.heather;

import java.util.Observable;
import java.util.Observer;

public class PoliceStation implements Observer  // 观察者1：警察局
{ 
	@Override
	public void update(Observable o, Object arg) //不能省略public，因为访问控制字符权限不能小于父类
	{    
	    Call tele=(Call) o;
		if (arg=="110")
		{System.out.println("Call the police!");
	    System.out.println("The target address is"+tele.getAddress());}
		
	}
}