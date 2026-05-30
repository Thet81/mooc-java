// TemperatureSensor.java

package application;
import java.util.*;
public class TemperatureSensor implements Sensor{
	public static void main(String[] args) {
		TemperatureSensor ts = new TemperatureSensor(10);
		ts.setOn();
		System.out.println(ts.read());
		// ts.setOff();
		System.out.println(ts.read());
	}
	private int value;
	private boolean isTempOn = false;

	public TemperatureSensor(int value){
		this.value = value;
	}

	@Override
	public void setOn(){
		this.isTempOn = true;
	}

	@Override 
	public boolean isOn(){
		return this.isTempOn;
	}

	@Override
	public void setOff(){
		this.isTempOn = false;
	}

	@Override
	public int read(){
		if(this.isOn()){
			int temp = new Random().nextInt(61);
			return temp;
		}else {
			throw new IllegalStateException();
		}
	}
}