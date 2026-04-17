// StringDemo.java
import java.util.*;

class StringDemo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Give a word : ");

		int index = 0;
		String concatedString = "";
		String input = reader.nextLine();
		concatedString = concatedString + input + input + input ;
		System.out.println(concatedString);
	}
}