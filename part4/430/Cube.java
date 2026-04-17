// Cube.java
import java.util.*;

class Cube {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int cube = 0;

		while(true) {
			String input = scanner.nextLine();

			if (input.isEmpty()){
				break;
			}
			int number = Integer.valueOf(input);
			cube = number * number * number;
		}

		System.out.println(cube);
	}
}