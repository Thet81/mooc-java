// Reduce.java
import java.util.*;

public class Reduce {
	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(7);
		values.add(3);
		values.add(2);
		values.add(1);

		int total = reduceNumbers(values);
		System.out.println(total);

		ArrayList<String> words = new ArrayList<>();
		words.add("First");
		words.add("Second");
		words.add("Third");

		String combinedWords = reduceWords(words);
		System.out.println(combinedWords);
	}

	public static int reduceNumbers(ArrayList<Integer> numbers){
		int sum = numbers.stream()
			.reduce(0, (prev,val)-> prev + val);
		return sum;
	}

	public static String reduceWords(ArrayList<String> words){
		String combined = words.stream()
			.reduce("",(prev , val)-> prev + val );
		return combined;
	}
}