// Person.java

public class Person {
	private String name;
	private int age;

	public Person (String personName) {
		this(personName,0);
	}

	public Person(String personName, int age) {
		this.name = personName;
		this.age = age;
	}

	public void growOlder () {
		this.age += 1;
	}

	public String getName () {
		return this.name;
	}

	@Override
	public String toString(){
		return this.name + ", age " + this.age ;
	}
}