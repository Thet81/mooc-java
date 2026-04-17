// Continue.java
import java.util.*;
public class Continue {

	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);

		while (true) {
			System.out.println("Input a number");
			int number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				break;
			}

			if (number < 0) {
				System.out.println("Unfit number");
				continue;
			}

			System.out.println(number + number);
		}
	}
}