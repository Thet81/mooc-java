// DayOfWeek.java
import java.util.*;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("Enter a String : ");
			String day = scanner.nextLine();

			if(day.isEmpty()){
				break;
			}
			if(isDayOfWeek(day)){
				System.out.println("The form is correct.");
			}else {
				System.out.println("The form is uncorrect.");
			}
		}
	}

	public static boolean isDayOfWeek(String string){
		String dayOfWeek = "mon|tue|wed|thu|fri|sat|sun";
		if(string.matches(dayOfWeek)){
			return true;
		}else {
			return false;
		}
	}
}