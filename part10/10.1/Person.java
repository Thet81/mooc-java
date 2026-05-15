// Person.java

public class Person {
	private String firstName;
	private String lastName;
	private int brithYear;

	public Person(String firstName,int brithYear){
		this(firstName,"",brithYear);
	}
	public Person (String firstName, String lastName, int brithYear){
		this.firstName = firstName;
		this.lastName = lastName;
		this.brithYear = brithYear;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public int getBirthYear(){
		return this.brithYear;
	}

	public String getLastName(){
		return this.lastName;
	}

	@Override
	public String toString(){
		return this.firstName;
	}
}