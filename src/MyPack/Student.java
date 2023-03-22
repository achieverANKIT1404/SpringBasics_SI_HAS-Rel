package MyPack;

public class Student {

	private int roll;
	private String name;
	private Address address;
	
	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void Info(){
		
		System.out.println(roll+" "+name+" "+address);
	}
}
