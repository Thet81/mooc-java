// AverageSensor.java

package application;
import java.util.*;

public class AverageSensor implements Sensor{

	public static void main(String[] args) {
		AverageSensor avsensor = new AverageSensor();
		TemperatureSensor tempOne = new TemperatureSensor(10);
		TemperatureSensor tempTwo = new TemperatureSensor(2);
		avsensor.addSensor(tempOne);
		avsensor.addSensor(tempTwo);
		avsensor.setOn();
		avsensor.setOff();
		System.out.println(avsensor.isOn());
		System.out.println(avsensor.read());
	}
	private List<Sensor> sensors;
	private boolean isSensorOn;

	public AverageSensor(){
		this.sensors = new ArrayList<>();
		isSensorOn = false;
	}

	public void addSensor(Sensor toAdd){
		this.sensors.add(toAdd);
	}

	public boolean isOn(){
		for(Sensor sensor : this.sensors){
			if(sensor.isOn() == false){
				this.isSensorOn = false;
				return this.isSensorOn;
			}
		}
		this.isSensorOn = true;
		return this.isSensorOn;
	}

	@Override
	public void setOff(){
		for(Sensor sensor : this.sensors){
			sensor.setOff();
		}
	}

	@Override
	public int read(){
		if(this.sensors.size() == 0 || this.isSensorOn == false){
			throw new IllegalStateException();
		}
		int total = 0;
		for(Sensor sensor : this.sensors){
			total += sensor.read();
		}
		return total / this.sensors.size();
	}

	@Override
	public void setOn(){
		for(Sensor sensor : this.sensors){
			sensor.setOn();
		}
	}
}