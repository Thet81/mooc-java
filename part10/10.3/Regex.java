// Regex.java
import java.util.*;

public class Regex{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 01 followed by 7 digits between 0 and 9 : e.g 016724839");
		String number = scanner.nextLine();

		if(number.matches("01[0-9]{7}")){
			System.out.println("Correct format.");
		}else {
			System.out.println("Incorrect format.");
		}
	}
}