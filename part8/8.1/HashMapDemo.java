
import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> postalCodes = new HashMap<>();
		postalCodes.put("00710","Helsinki");
		postalCodes.put("900","Oulu");
		System.out.println(postalCodes.get("00710"));
	}
}