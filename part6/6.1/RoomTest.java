// RoomTest.java
import java.util.*;
class RoomTest{
	public static void main(String[] args) {
		Room room = new Room();
		System.out.println("Empty room ? " + room.isEmpty());

		room.add(new Person("Lea",183));
		room.add(new Person("Kenya",182));
		room.add(new Person("Auli",186));

		System.out.println("Empty room ? " + room.isEmpty());

		ArrayList<Person> people = room.getPersons();
		System.out.println(people);

		for(Person person : room.getPersons()){
			System.out.println(person);
		}

		System.out.println("Shortest person is " + room.shortest());

		room.take();

		for(Person person : room.getPersons()){
			System.out.println(person);
		}
	}
}