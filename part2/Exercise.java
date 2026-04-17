// Exercise.java
import java.util.*;

class Exercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int numbers = 0;
		System.out.println("Enter a number");
		while(true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}
			sum += input;
			numbers = input;	
		}
		System.out.println("Thx bye!");
		System.out.println(sum);
		System.out.println(numbers);

	}
}