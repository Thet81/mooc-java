// AvDemo.java
import java.util.*;

class AvDemo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string");

		String texts = reader.nextLine();
		String[] pieces = texts.split(" ");

		for (int i=0 ; i < pieces.length; i++) {
			// System.out.println(pieces[i].split(""));
			if (pieces[i].contains("av")){
				System.out.println(pieces[i]);
			}
		}
	}
}