// PetProgram.java

class PetProgram {
	public static void main(String[] args) {
		Pet lucy = new Pet("lucy","Golden Retriver");
		PetPerson leo = new PetPerson("leo",lucy);
		System.out.println(leo);
	}
}