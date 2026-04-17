// Methods.java
import java.util.*;

class Methods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("How many times do you want to call the method?");
		// int input = Integer.valueOf(scanner.nextLine());
		greet(1);
		System.out.println("");
		greet(3);
	}

	public static void greet(int times){
		int time = 0;
		while (time < times) {
			System.out.println("Greeting from the method world!");
			time ++;
		}
	}
}