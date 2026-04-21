// Person.java

public class Person {
	private String name;
	private int height;
	private int weight;

	public Person(String name){
		this(name,0,0);
	}

	public Person(String name, int height){
		this(name, height,0);
	}

	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void setHeight (int newHeight) {
		this.height = newHeight;
	}

	public int getHeight () {
		return this.height;
	}

	public String getName() {
		return this.name;
	}

	public void setWeight (int newWeight){
		this.weight = newWeight;
	}

	public int getWeight () {
		return this.weight;
	}

	public String toString() {
		return this.name;
	}
}