// AmusementParkRide.java
import java.util.*;

public class AmusementParkRide {
	private String name;
	private int lowestHeight;
	private int visitors;
	private ArrayList<Person> riding;

	public AmusementParkRide(String name, int lowestHeight){
		this.name = name;
		this.lowestHeight = lowestHeight;
		this.visitors = 0;
		this.riding = new ArrayList<>();
	}

	public boolean allowedToRide (Person person){
		if (person.getHeight() < this.lowestHeight){
			return false;
		}
		visitors ++;
		this.riding.add(person);
		return true;
	}
	public Person getTallest() {
		if(this.riding.isEmpty()){
			return null;
		}

		Person returnObject = this.riding.get(0);

		for(Person person : this.riding){
			if(person.getHeight() > returnObject.getHeight()){
				returnObject = person;
			}
		}

		return returnObject;
	}
	public String toString() {
		String onTheRide = "";
		for(Person person : riding) {
			onTheRide = onTheRide + person.getName() + "\n";
		}

		return this.name + ", minimum height requirement " + this.lowestHeight + ", visitors " + this.visitors + "\n" + "riding : \n" + onTheRide;
	}

	public double averageHeightOfPeopleOnRide(){
		if (riding.isEmpty()){
			return -1;
		}

		int sumOfHeights = 0;
		for(Person person : riding){
			sumOfHeights += person.getHeight();
		}

		return 1.0 * sumOfHeights / riding.size();
	}

	public void removeEveryoneOnRide () {
		this.riding.clear();
	}
}