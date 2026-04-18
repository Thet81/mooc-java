// PersonWithDateDemo.java

class PersonWithDateDemo {
	public static void main(String[] args) {
		SimpleDate date = new SimpleDate(1,1,780);
		PersonWithDate muhammad = new PersonWithDate("Muhammad ibn Musa al-Khwarizmi ",date);
		PersonWithDate pascal = new PersonWithDate("Blaise Pascal",19,6,1623);

		System.out.println(muhammad);
		System.out.println(pascal);
	}
}