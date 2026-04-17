// HealthStation.java

public class HealthStation {
	private int wighings;

	public int weigh (Person person ){
		this.wighings ++;
		return person.getWeight();
	}

	public int wighings(){
		return this.wighings;
	}
	public void feed(Person person) {
		person.setWeight(person.getWeight() + 1);
	}
}