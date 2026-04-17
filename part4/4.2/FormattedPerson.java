// FormattedPerson.java
import java.util.*;

class FormattedPerson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();

		System.out.println("Enter the details separated by comma");
		while(true) {
			System.out.println("Enter the details, empty will stop");
			String details = scanner.nextLine();
			if (details.isEmpty()){
				break;
			}

			String[] parts = details.split(",");
			String name = parts[0];
			int age = Integer.valueOf(parts[1]);

			persons.add(new Person(name,age));
		}

		System.out.println("The size of the person collection is " + persons.size());

		System.out.println("Enter the age limits");
		int ageLimit = Integer.valueOf(scanner.nextLine());

		for(Person person : persons) {
			if (person.returnAge() >= ageLimit) {
				System.out.println(person);
			}
		}
	}
}