// ReadyMadeSort.java
import java.util.*;

class ReadyMadeSort{
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(0);
		nums.add(5);
		nums.add(3);
		sort(nums);

		System.out.println(nums);

		ArrayList<String> strings = new ArrayList<>();
		strings.add("i");
		strings.add("have");
		strings.add("a");
		strings.add("cat");
		sortStrings(strings);
		System.out.println(strings);
	}

	public static void sort(int[] array) {
		Arrays.sort(array);
	}

	public static void sort(String[] string) {
		Arrays.sort(string);
	}

	public static void sort(ArrayList<Integer> nums) {
		Collections.sort(nums);
	}

	public static void sortStrings(ArrayList<String> strings) {
		Collections.sort(strings);
	}
}