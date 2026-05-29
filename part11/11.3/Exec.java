// Exec.java

import java.util.Scanner;

public class Exec{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		readNumber(reader);
	}

	public static int readNumber(Scanner reader){
		while(true){
			System.out.println("Give a number");

			try {
				int readNumber = Integer.parseInt(reader.nextLine());
				return readNumber;
			}catch (Exception e){
				System.out.println("Input value was not a number!");
			}
		}
	}
}