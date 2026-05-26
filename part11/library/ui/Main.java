// Main.java
package library.ui;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		UserInterface ui = new UserInterface(scanner);
		ui.printTitle();
	}
}