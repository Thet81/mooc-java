// PersonWithDate.java

// Person.java

public class PersonWithDate {
	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public PersonWithDate (String personName, SimpleDate date) {
		this(personName,date,0,0);
	}

	// public PersonWithDate(String name, SimpleDate date, int , int month, int year) {
	// 	this.name = name;
	// 	this.date = date;
	// 	this.height = height
	// 	// this.birthday = new SimpleDate(day,month,year);
	// }

	public PersonWithDate(String name, SimpleDate date, int height , int weight) {
		this.name = name;
		this.birthday = date;
		this.height = height;
		this.weight = weight;
		// this.birthday = new SimpleDate(day,month,year);
	}

	public boolean equals(PersonWithDate compared){
		if (this == compared) {
			return true;
		}

		if (!(compared instanceof PersonWithDate)){
			return false;
		}

		PersonWithDate comparedPerson = (PersonWithDate) compared;

		if (this.name.equals(comparedPerson.name) &&
			this.birthday.equals(comparedPerson.birthday) &&
			this.height == comparedPerson.height && 
			this.weight == comparedPerson.weight
			){
			return true;
		}
		return false;
	}

	public boolean olderThan(PersonWithDate compared) {
		if (this.birthday.before(compared.getBirthday())){
			return true;
		}
		return false;
	}

	public String getName () {
		return this.name;
	}

	public void setHeight (int newHeight) {
		this.height = newHeight;
	} 
	public int getHeight () {
		return this.height;
	}
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

	public int getWeight () {
		return this.weight;
	}

	public SimpleDate getBirthday() {
		return this.birthday;
	}
	@Override
	public String toString(){
		return this.name + "was born on " + this.birthday;
	}
}