// Sehun Babatunde

package classmembers;

public class Customer {

	private String firstName;
	private String Surname;
	
	
	public Customer(String firstName, String Surname)
	{
		this.firstName = firstName;
		this.Surname = Surname;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return Surname;
	}


	public void setSurname(String surname) {
		Surname = surname;
	}
	
	
	
}
