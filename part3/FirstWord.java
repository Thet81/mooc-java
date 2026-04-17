// FirstWord.java
import java.util.*;

class FirstWord {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while(true) {
			String input = reader.nextLine();

			if (input == "") {
				break;
			}

			String[] piece = input.split(" ");
			System.out.println(piece[piece.length -1]);
		}
	}
}