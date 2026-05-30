// StandardSensor.java

package application;

public class StandardSensor implements Sensor{
	private int value;
	public static void main(String[] args) {
		StandardSensor ten = new StandardSensor(10);
		StandardSensor minusFive = new StandardSensor(-5);

		System.out.println(ten.read());
		System.out.println(minusFive.read());

		System.out.println(ten.isOn());
		ten.setOff();
		System.out.println(ten.isOn());
	}
	public StandardSensor(int value){
		this.value = value;
	}
	@Override
	public boolean isOn(){
		return true;
	}

	@Override 
	public void setOn(){
		System.out.println("");
	}

	@Override
	public void setOff(){
		System.out.println("");
	}

	@Override
	public int read(){
		return this.value;
	}
}