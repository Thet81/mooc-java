// Person.java

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Person(String initialName) {
		this(initialName,0);
		// we don't want to write the whole thing out
		// this gonna call the second constructor
		
		// this.name = initialName;
		// this.age = 0;
		// this.weight = 0;
		// this.height = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
	}

	public void setHeight (int newHeight) {
		this.height = newHeight;
	}

	public void setWeight (int newWeight) {
		this.weight = newWeight;
	}

	public double bodyMassIndex () {
		double heightPerHundred = this.height / 100.0;
		return this.weight / (heightPerHundred * heightPerHundred);
	}

	public void printPerson (){
		System.out.println(this.name + ", age " + this.age + " years");
	}

	public void growOlder () {
		this.age = this.age + 1;
	}

	public int returnAge () {
		return this.age;
	}

	public boolean isAdult() {
		if (this.age < 18){
			return false;
		}
		return true;
	}

	@Override
	public String toString () {
		return this.name + ", age" + this.age + " years";
	}
}