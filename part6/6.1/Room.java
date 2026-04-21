// Room.java
import java.util.*;

public class Room {
	private ArrayList<Person> persons;

	public Room(){
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		persons.add(person);
	}

	public boolean isEmpty() {
		if(this.persons.size() <= 0){
			return true;
		}
		return false;
	}

	public ArrayList<Person> getPersons() {
		return this.persons;
	}

	public Person shortest(){
		if(this.persons.size() == 0){
			return null;
		}

		Person shortestPerson = this.persons.get(0);

		for(Person person : this.persons){
			if(person.getHeight() < shortestPerson.getHeight()){
				shortestPerson = person;
			}
		}

		return shortestPerson;
	}

	public Person take() {
		Person shortestPerson = this.shortest();
		this.persons.remove(shortestPerson);
		return shortestPerson;
	}
}