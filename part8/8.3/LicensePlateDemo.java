// LicensePlateDemo.java
import java.util.*;

class LicensePlateDemo {
	public static void main(String[] args) {
		LicensePlate li1 = new LicensePlate("FI","ABC-123");
		LicensePlate li2 = new LicensePlate("FI","UXE-456");
		LicensePlate li3 = new LicensePlate("D","B WQ-431");

		ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
		finnishPlates.add(li1);
		finnishPlates.add(li2);
		finnishPlates.add(li3);

		LicensePlate newLi = new LicensePlate("FI","ABC-123");

		if(!finnishPlates.contains(newLi)){
			finnishPlates.add(newLi);
		}

		System.out.println("finnish " + finnishPlates);

		HashMap<LicensePlate,String> owners = new HashMap<>();
		owners.put(li1, "Arto");
		owners.put(li3, "Jurgen");

		System.out.println("omistajat:");
		System.out.println(owners.get(new LicensePlate("FI","ABC-123")));
		System.out.println(owners.get(new LicensePlate("D","B WQ-431")));
	}
}