// CSV.java
import java.util.*;

class CSV {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while(true) {
			String input = reader.nextLine();
			if (input.equals("")) {
				break;
			}

			String[] pieces = input.split(",");
			System.out.println("Name : " + pieces[0] + "Age : " + pieces[1]);
		}
	}
}