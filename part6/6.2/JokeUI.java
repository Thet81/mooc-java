// JokeUI.java
import java.util.*;

public class JokeUI {
	private Scanner scanner;
	private JokeManager manager;

	public JokeUI(Scanner scanner, JokeManager manager){
		this.scanner = scanner;
		this.manager = manager;
	}

	public void start(){
		while(true){
			System.out.println("Command:");
			System.out.println(" 1 - add a joke ");
			System.out.println(" 2 - draw a joke");
			System.out.println(" 3 - list jokes");
			System.out.println(" 4 - stop");

			String command = this.scanner.nextLine();

			if(command.equals("4")){
				break;
			}else if (command.equals("1")){
				System.out.println("Write the joke to be added.");
				String joke = this.scanner.nextLine();
				this.manager.addJoke(joke);
			}else if (command.equals("2")){
				String joke = this.manager.drawJokes();
				System.out.println(joke);
			}else if (command.equals("3")){
				this.manager.printJokes();
			}
		}
	}
}