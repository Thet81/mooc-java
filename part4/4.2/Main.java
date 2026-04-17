// Main.java
import java.util.*;

class Main {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String name = scanner.nextLine();
			if (name.isEmpty()){
				break;
			}

			System.out.println("Enter the age of " + name);
			String age = scanner.nextLine();

			persons.add(new Person(name,Integer.valueOf(age)));

			System.out.println("The size of the person list is " + persons.size());
		}

		for (Person person : persons) {
				System.out.println(person);
		}
	}
}