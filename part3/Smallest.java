// Smallest.java
import java.util.*;

class Smallest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(-3);
		numbers.add(9);

		int smallest = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < smallest) {
				smallest = numbers.get(i);
			}
		}
		System.out.println("Smallest : " + smallest);
	}
}