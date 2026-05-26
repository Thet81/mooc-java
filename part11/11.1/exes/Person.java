// Person.java

public class Person implements Saveable{
	private String name;
	private int age;
	private String address;

	@Override
	public void save(){
		System.out.println("Saving person");
	}

	@Override
	public void delete(){
		System.out.println("Deleting the person");
	}

	@Override
	public void load(String address){
		System.out.println(address);
	}
}
