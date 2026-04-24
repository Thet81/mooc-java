// AutoBoxing.java
import java.util.*;

class AutoBoxing {
	public static void main(String[] args) {
		int key = 2;
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		hashmap.put(key,10);
		int value = hasmap.get(key);
		System.out.println(value);
	}
}