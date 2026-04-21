// ContainerUI.java
import java.util.*;

class ContainerUI {
	public static void main(String[] args) {
		Container one = new Container();
		Container two = new Container();
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Command");
			System.out.println("First : " + one);
			System.out.println("Second : " + two);

			String input = scanner.nextLine();
			String[] parts = input.split(" ");

			if(input.equals("quit")){
				break;
			}
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);

			if (command.equals("add")){
				one.add(amount);
			}else if (command.equals("move")){
				if(one.contains() >= amount){
					one.remove(amount);
					two.add(amount);
				}
			}else if (command.equals("remove")){
				two.remove(amount);
			}
		}
	}
}