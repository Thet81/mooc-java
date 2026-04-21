// Main.java
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WordSet wordset = new WordSet();
		UserInterface userInterface = new UserInterface(scanner,wordset);
		userInterface.start();
	}
}