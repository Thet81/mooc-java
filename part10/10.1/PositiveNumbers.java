// PositiveNumbers.java
import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(-1);
		nums.add(-6);

		List<Integer> pos = positive(nums);
		System.out.println(pos);
	}
	public static List<Integer> positive(List<Integer> numbers){
		List<Integer> positives = numbers.stream()
			.filter(n -> n > 0)
			.collect(Collectors.toList());
		return positives;
	}
}