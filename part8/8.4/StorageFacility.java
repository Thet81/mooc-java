// StorageFacility.java
import java.util.*;

public class StorageFacility {
	private HashMap<String,ArrayList<String>> items;

	public static void main(String[] args) {
		StorageFacility facility = new StorageFacility();
		facility.add("a14","ice skates");
		facility.add("a14","ice hockey stick");
		facility.add("a14","ice skates");

		facility.add("f156","rollerblades");
		facility.add("f156","pi");

		facility.remove("f156","pi");
		facility.remove ("f156","rollerblades");
		System.out.println(facility.contents("a14"));
		System.out.println(facility.contents("a15"));
		System.out.println(facility.contents("f156"));
	}

	public StorageFacility(){
		this.items = new HashMap<>();
	}

	public void add(String unit , String item){
		this.items.putIfAbsent(unit,new ArrayList<>());

		ArrayList<String> contents = this.items.get(unit);
		contents.add(item);
	}

	public ArrayList<String> contents (String storageUnit){
		if(!(this.items.get(storageUnit) == null)){
			return this.items.get(storageUnit);
		}

		return new ArrayList<String>();
	}

	public void remove(String storageUnit, String item){
		ArrayList<String> contents = this.items.get(storageUnit);
		
		if(contents.contains(item)){
			contents.remove(item);
		}
	}
}