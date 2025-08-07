package entities;

public class RentHotel {

	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + ", " + email ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RentHotel(String name, String email) {
		
		this.name = name;
		this.email = email;
	}
}
