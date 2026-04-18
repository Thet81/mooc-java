// PetPerson.java

class PetPerson {
	private String name;
	private int age;
	private Pet pet;

	public PetPerson(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}

	@Override
	public String toString(){
		return this.name + " has " + this.pet;
	}
}