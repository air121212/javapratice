package com.heather;

import java.util.Observable;

public class Call extends Observable // ���۲��ߣ����е绰
{   
	private String number = "00";
	private String address = "��";
	
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