// Printer.java
import java.util.*;

public class Printer {

	public static void main(String[] args) {
		Printer printer = new Printer();

		String string = "O";
		List<String> words = new ArrayList<>();
		words.add("polymorphism");
		words.add("inheritance");
		words.add("encapsulation");
		printer.printManyTimes(string,3);
		printer.printManyTimes(words,4);
		String stringTwo = "works";
		printer.printCharacters(stringTwo);
	}
	public void printManyTimes (Object object, int times){
		int i = 0;

		while( i < times){
			System.out.println(object.toString());
			i++;
		}
	}

	public void printCharacters(CharSequence charsequence){
		int i = 0;

		while( i < charsequence.length()){
			System.out.println(charsequence.charAt(i));
			i ++;
		}
	}
}