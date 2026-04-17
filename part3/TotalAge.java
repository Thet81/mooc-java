// TotalAge.java
import java.util.*;

class TotalAge {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true) {
			String input = reader.nextLine();
			if (input == ""){
				break;
			}
			String[] age = input.split(",");
			sum += Integer.valueOf(age[1]);
		}
		System.out.println("Total age is : " + sum);	
	}
}