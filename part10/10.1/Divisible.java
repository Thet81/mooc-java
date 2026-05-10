// Divisible.java
import java.util.*;
import java.util.stream.Collectors;

public class Divisible {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(-17);
		numbers.add(-5);
		numbers.add(7);

		List<Integer> divisible = divisible(numbers);

		divisible.stream()
			.forEach(n-> System.out.println(n));
	}

	public static List<Integer> divisible(List<Integer> numbers){
		List<Integer> nums = numbers.stream()
			.filter(n -> n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
			.collect(Collectors.toList());
		return nums;
	}
}