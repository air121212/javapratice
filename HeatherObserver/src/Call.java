
public class Call extends MyObservable
{
	private String number ;
	private String address ;
	
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
