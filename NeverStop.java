// NeverStop.java

import java.util.*;

public class NeverStop {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = 1;

		while ( number !=2 ) {
			System.out.println(number);

			number = 2;
			System.out.println(number);
			number = 1;
		}	
	}
}