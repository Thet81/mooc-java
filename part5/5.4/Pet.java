// Pet.java

public class Pet{
	private String name;
	private String type;

	Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString () {
		return this.name + "(" + this.type + ")";
	}
}