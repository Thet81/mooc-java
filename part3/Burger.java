// Burger.java
import java.util.*;

class Burger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Customer number : ");
		int y = Integer.valueOf(scanner.nextLine());
		
		if (y >= 1000 && y % 25 == 0 && y < 2000) {
			System.out.print("Gets gift card!");
		}else if ( y % 2000 == 0){
			System.out.print("Gets a larger gift card!");
		}else {
			System.out.print("Gets nothing!");
		}
	}
}