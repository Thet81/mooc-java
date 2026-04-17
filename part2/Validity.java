// Validity.java
import java.util.*;
/*
	The program handles negative numbers as invalid, zero stops the loop
	When the user enter zero, the program prints the sum of the valid numbers and the sum of 
	the invalid numbers
*/
class Validity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write numbers, negative numbers are invalid");
		int sum = 0;
		int invalidNumber = 0;
		int validNumber = 0;

		while(true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == 0) {
				break;
			}

			if (input < 0) {
				invalidNumber ++;
				continue;
			}

			validNumber++;
			sum += input;
		}
		System.out.println("The sum is " + sum);
		System.out.println("Valid numbers" + validNumber);
		System.out.println("Invalid number is " + invalidNumber);
	}
}