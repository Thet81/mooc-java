// JokeDemo.java
import java.util.*;

class JokeDemo {
	public static void main(String[] args) {
		JokeManager manager = new JokeManager();
		Scanner scanner = new Scanner(System.in);
		JokeUI ui = new JokeUI(scanner,manager);
		ui.start();
	}
}