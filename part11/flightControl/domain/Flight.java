// Flight.java
package flightControl.domain;

public class Flight{

	private Airplane airplane;
	private Place deparatureAirport;
	private Place targetAirport;

	public Flight(Airplane airplane,Place deparatureAirport,Place targetAirport){
		this.airplane = airplane;
		this.deparatureAirport = deparatureAirport;
		this.targetAirport = targetAirport;
	}

	public Airplane getAirplance(){
		return this.airplane;
	}

	public Place getDeparturePlace (){
		return this.deparatureAirport;
	}

	public Place getTargetPlace(){
		return this.targetAirport;
	}

	@Override
	public String toString(){
		return this.airplane.toString() + " (" + this.deparatureAirport + "-" + this.targetAirport;
	}
}