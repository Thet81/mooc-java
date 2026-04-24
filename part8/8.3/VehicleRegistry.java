// VehicleRegistry.java
import java.util.*;

public class VehicleRegistry {

	private HashMap<LicensePlate,String> plates;

	public VehicleRegistry(){
		this.plates = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner){
		if(this.plates.get(licensePlate) == null){
			plates.put(licensePlate,owner);
			return true;
		}

		return false;
	}

	public String get(LicensePlate licensePlate){
		if(this.plates.get(licensePlate) == null){
			return "";
		}

		return this.plates.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate){
		if(!(this.plates.get(licensePlate) == null)){
			 this.plates.remove(licensePlate);
			 return true;
		}
		return false;
	}

	public void printLicensePlates() {
		for(LicensePlate li : this.plates.keySet()){
			System.out.println(li);
		}
	}

	public void printOwners () {
		ArrayList<String> owners = new ArrayList<>();

		for(String owner : this.plates.values()){
			if(!(owners.contains(owner))){
				owners.add(owner);
			}
		}

		for(String owner : owners){
			System.out.println(owner);
		}


	}
}