// Person.java

public class Person {
	private String name;
	private int age;
	private height;
	private weight;

	public Person(String initialName) {
		this.name = initialName;
		this.age = 0;
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
		return this.weight / (heightPerHundred * heightPerHundred)
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