package MyPack;

public class Address {

	private int plotNo;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
