// LambdaDemo.java
import java.util.*;

class LambdaDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		numbers.add(8);

		long greaterThanFiveCount = numbers.stream()
			// .filter(Screener::greaterThanFive)
			.filter (value -> Screener.greaterThanFive(value))
			// .filter(n -> n > 5)
			.count();
		System.out.println(greaterThanFiveCount);
	}
}