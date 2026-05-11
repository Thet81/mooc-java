// LimitedNumbers.java
import java.util.*;

public class LimitedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<>();

		while(true){
			String input = scanner.nextLine();
			int numInput = Integer.valueOf(input);
			if (Integer.valueOf(numInput) < 0) {
				break;
			}

			inputs.add(numInput);
		}

		inputs.stream()
			.filter (number -> number > 0 && number < 5)
			.forEach(n -> System.out.println(n));
	}
}