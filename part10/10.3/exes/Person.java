// Person.java

public class Person {

	public static void main(String[] args) {
		Person anna = new Person("Anna",Education.PHD);
		System.out.println(anna);
	}
	private String name;
	private Education education;

	public Person(String name, Education education){
		this.name = name;
		this.education = education;
	}

	public Education getEducation (){
		return this.education;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public String toString(){
		return this.name + ", " + this.education;
	}
}