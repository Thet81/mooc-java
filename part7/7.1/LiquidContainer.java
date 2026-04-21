// LiquidContainer.java
import java.util.*;

public class LiquidContainer {
	public static void main(String[] args) {
		int fContainer = 0;
		int sContainer = 0;

		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("First:" + fContainer + "/100");
			System.out.println("Second:" + sContainer + "/100");

			String input = scanner.nextLine();
			String[] parts = input.split(" ");

			if(input.equals("quit")){
				break;
			}
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);

			if (command.equals("add")){
				if (fContainer + amount <= 100){
					fContainer += amount;
				}
				continue;
			}else if (command.equals("move")){
				if(amount  <= 100){
					if(amount + sContainer <= 100){
						if(fContainer >= amount){
							sContainer += amount;
							fContainer -= amount;
						}else if (amount > fContainer){
							sContainer += fContainer;
							fContainer = 0;
						}	
					}
				}
			}else if (command.equals("remove")){
				if(amount <= sContainer){
					sContainer -= amount;
				}else if (amount > sContainer){
					sContainer = 0;
				}
			}
		}
	}
}