// VowelCheck.java
import java.util.*;

public class VowelCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("Enter a String : ");
			String word = scanner.nextLine();

			if(word.isEmpty()){
				break;
			}
			if(allVowels(word)){
				System.out.println("The form is correct.");
			}else {
				System.out.println("The form is uncorrect.");
			}
		}
	}

	public static boolean allVowels(String string){
		String vowels = "(a|e|i|o|u)*";
		if(string.matches(vowels)){
			return true;
		}else {
			return false;
		}
	}
}