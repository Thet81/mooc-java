// UniqueLastName.java
import java.util.*;

public class UniqueLastName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Person> persons = new ArrayList<>();


		while(true){
			System.out.println("Continue personal information input? \"quits\" ends");
			String input = scanner.nextLine();

			if(input.equals("quits")){
				break;
			}

			System.out.print("Input firstName : ");
			String firstName = scanner.nextLine();
			System.out.print("Input lastName : ");
			String lastName = scanner.nextLine();
			System.out.print("Input year of birth : ");

			int yearOfBirth = Integer.valueOf(scanner.nextLine());
			persons.add(new Person(firstName,lastName,yearOfBirth));
		}

		persons.stream()
			.map(person -> person.getLastName())
			.distinct()
			.sorted()
			.forEach(p -> System.out.println(p));
	}
}