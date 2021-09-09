package Entities;

public class User {
	public int Id;
	public String FirstName;
	public String LastName;
	public int DateOfBird;
	public String NationalityId;

	//-------------Field-----------------
	public User(int id, String firstName, String lastName, int dateOfBird, String NationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBird = dateOfBird;
		NationalityId=NationalityId;
	}
	

	
	//----------------------- Getter and Setter----------------------
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateOfBird() {
		return DateOfBird;
	}
	public void setDateOfBird(int dateOfBird) {
		DateOfBird = dateOfBird;
	}



	public String getNationalityId() {
		return NationalityId;
	}



	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
