package com.heather;

import java.util.Observable;

public class Call extends Observable // 被观察者：呼叫电话
{   
	private String number = "00";
	private String address = "无";
	
	void calling(String number, String address)
	{ 
		this.number = number;
		this.address = address;
		setChanged();
		notifyObservers(number);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}