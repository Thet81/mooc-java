// Person.java

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Person (String personName) {
		this(personName,0);
	}

	public Person(String personName, int age) {
		this(personName,age,0,0);
	}

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void growOlder () {
		this.age += 1;
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
	@Override
	public String toString(){
		return this.name + ", age " + this.age ;
	}
}