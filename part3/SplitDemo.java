// SplitDemo.java
import java.util.*;

class SplitDemo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = reader.nextLine();

		String[] pieces = text.split(" ");
		if (pieces.length == 0) {
			return;
		}
		for(int i = 0 ; i < pieces.length; i++) {
			System.out.println(pieces[i]);
		}
	}
}