import java.util.UUID;


public class Person {
	private String FirstName;
	private String LastName;
	private static UUID PersonID;
	
	public String getFirstName(){
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public UUID getPersonID() {
		return PersonID;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setPersonID() {
		PersonID = UUID.randomUUID();
	}
	Person(String FirstName, String LastName){
		this.FirstName = FirstName;
		this.LastName = LastName;
		setPersonID();
		
	}
}
