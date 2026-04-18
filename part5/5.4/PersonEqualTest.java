// PersonEqualTest.java

class PersonEqualTest {
	public static void main(String[] args) {
		Person james = new Person("James");
		Person john;
		// Person john = new Person("James");
		john = james;
		System.out.println(james.equals(john));
	}
}