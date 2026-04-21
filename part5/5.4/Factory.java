// Factory.java

public class Factory {
	private String make;

	public Factory(String make) {
		this.make = make;
	}

	public Car produceCar(){
		return new Car(this.make);
	}
}