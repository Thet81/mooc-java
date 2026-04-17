// Oldest.java
import java.util.*;

class Oldest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int index = 0;
		// int largest = 0;
		String[] oldest = {"james","0"};
		while(true) {
			String input = reader.nextLine();

			if (input == "") {
				break;
			}

			String[] age = input.split(",");
			
			if (Integer.valueOf(age[1]) > Integer.valueOf(oldest[1])){
				oldest = age;
			}
		}

		System.out.println("age of the oldest name: " + oldest[0]);
	}
}