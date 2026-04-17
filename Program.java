// Program.java

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Exit? (y exits)");
			String input = scanner.nextLine();

			if (input.equals("y")) {
				break;
			}

			System.out.println("Ok! Let's carry on!");
		}


		System.out.println("Ready!");
	}
}