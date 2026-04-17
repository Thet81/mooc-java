// Person.java

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Person(String initialName, int personAge) {
		this.name = initialName;
		this.age = personAge;
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

	@Override
	public String toString () {
		return this.name + ", age" + this.age + " years";
	}
}