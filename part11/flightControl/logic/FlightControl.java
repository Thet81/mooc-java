// FlightControl.java

package flightControl.logic;

import java.util.Collection;
import flightControl.domain.Flight;
import flightControl.domain.Airplane;
import flightControl.domain.Place;
import java.util.HashMap;
import java.util.Map;

public class FlightControl{

	private HashMap<String,Airplane> ariplanes;
	private HashMap<String, Flight> flights;
	private Map<String, Place> places;

	public FlightControl(){
		this.flights = new HashMap<>();
		this.ariplanes = new HashMap<>();
		this.places = new HashMap<>();
	}

	public void addAirplane(String ID, int capacity){
		Airplane plane = new Airplane(ID,capacity);
		this.ariplanes.put(ID,plane);
	}

	public void addFlight(Airplane plane, String depatureID, String destinationID){
		this.places.putIfAbsent(depatureID, new Place(depatureID));
		this.places.putIfAbsent(destinationID, new Place(destinationID));

		Flight flight = new Flight(plane, this.places.get(depatureID),this.places.get(destinationID));
		this.flights.put(flight.toString(),flight);
	}

	public Collection<Airplane> getAriplanes(){
		return this.ariplanes.values();
	}

	public Collection<Flight> getFlights(){
		return this.flights.values();
	}

	public Airplane getAirplane(String ID){
		return this.ariplanes.get(ID);
	}
}