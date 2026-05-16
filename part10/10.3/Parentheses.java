// Parentheses.java

public class Parentheses {

	public static void main(String[] args) {
		String example = "00000|00001"
		// same as 
		String sameAsExample = "0000(0|1)";
		/**
		 * Similarly, the regular expression car(|s|) defines the singular(car) and
		 * plural (cars) forms of the word car
		 * */
		String string = "trololololo";
		// the quantifier * repeats 0... times while + repeats 1 ... times
		if(string.matches("trolo(lo)*")){
			System.out.println("Correct form");
		}else {
			System.out.println("Incorrect form");
		}

		String repeatZeroOrOne = "You have to accidentally the whole meme";
		// the quantifier ? repeats 0 or 1 times
		// prints Correct form
		if(repeatZeroOrOne.matches("You have to accidentally (delete)?the whole meme")){
			System.out.println("Correct form.");
		}else {
			System.out.println("Incorrect form.");
		}

		// the quantifier {a} repeats a times
		String repeatWithOption = "1010";
		if(repeatWithOption.matches("(10){2}")){
			System.out.println("Correct form.");
		}else {
			System.out.printl("Incorrect form.");
		}
	}
}