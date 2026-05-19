// Employees.java
import java.util.*;

public class Employees {
	public static void main(String[] args) {
		Employees employee = new Employees();
		employee.add(new Person("Jack",Education.PHD));
		employee.add(new Person("John Doe",Education.MA));
		employee.print();
		System.out.println();
		employee.fire(Education.MA);
		employee.print();
	}
	private List<Person> employees;

	public Employees(){
		this.employees = new ArrayList<>();
	}

	public void add(Person personToAdd){
		this.employees.add(personToAdd);
	}

	public void print(){
		Iterator<Person> iterator = this.employees.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	public void print(Education education){
		Iterator<Person> iterator = this.employees.iterator();

		while(iterator.hasNext()){
			Person nextInLinePerson = iterator.next();
			if(nextInLinePerson.getEducation() == education){
				System.out.println(nextInLinePerson);
			}
		}
	}

	public void fire(Education education){
		Iterator<Person> iterator = this.employees.iterator();

		while(iterator.hasNext()){
			Person nextInLinePerson = iterator.next();
			if(nextInLinePerson.getEducation() == education){
				iterator.remove();
			}
		}
	}
}