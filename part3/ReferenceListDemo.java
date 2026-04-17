// ReferenceListDemo.java
import java.util.*;

class ReferenceListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		System.out.println(numbers);
		removeFirst(numbers);

		System.out.println(numbers);
		removeFirst(numbers);
		removeFirst(numbers);
		removeFirst(numbers);
		System.out.println(numbers);
	}
	public static void removeFirst (ArrayList<Integer> numbers) {
		if (numbers.size() == 0) {
			return;
		}

		numbers.remove(0);
	}
}