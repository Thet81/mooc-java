// PersonalInformation.java

class PersonalInformation {
	private String firstName;
	private String lastName;
	private int identificationNumber;

	public PersonalInformation(String fName, String lName, int id) {
		this.firstName = fName;
		this.lastName = lName;
		this.identificationNumber = id;
	}

	public String getName () {
		return this.getFirstName() + " " + this.getLastName();
	}

	public String getLastName () {
		return this.lastName;
	}

	public String getFirstName () {
		return this.firstName;
	}

	@Override
	public String toString () {
		return this.firstName;
	}
}