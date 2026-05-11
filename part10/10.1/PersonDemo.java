// PersonDemo.java
import java.util.*;

class PersonDemo {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		Person bob = new Person("Bob","Sagge",1965);
		Person james = new Person("James","Doe",1971);
		Person john = new Person("John","Doe",1974);
		Person johnTwo = new Person("John","Doe",1974);

		persons.add(bob);
		persons.add(james);
		persons.add(john);
		persons.add(johnTwo);

		long count = persons.stream()
			.filter(person -> person.getBirthYear() < 1970)
			.count();

		long countStartWithLetterJ = persons.stream()
			.filter(person -> person.getFirstName().startsWith("J"))
			.count();

		persons.stream()
			.map(person -> person.getFirstName())
			.distinct()
			.sorted()
			.forEach(name -> System.out.println(name));

		System.out.println("Count : " + count);
		System.out.println("Count of person whose name starts with letter J : " + countStartWithLetterJ);
	}
}