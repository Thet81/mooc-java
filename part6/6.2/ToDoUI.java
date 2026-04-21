// ToDoUI.java

import java.util.*;

public class ToDoUI {
	private TodoList todoList;
	private Scanner scanner;
	public ToDoUI(TodoList todolist, Scanner scanner){
		this.todoList = todolist;
		this.scanner = scanner;
	}

	public void start() {
		while(true){
			System.out.print("Command : ");
			String input = this.scanner.nextLine();
			if(input.equals("stop")){
				System.out.println("Bye bye!");
				break;
			}
			if(input.equals("add")){
				System.out.print("To add : ");
				String task = scanner.nextLine();
				this.todoList.add(task);
			}

			if(input.equals("list")){
				this.todoList.print();
			}

			if(input.equals("remove")){
				System.out.print("Which one is removed? ");
				String index = this.scanner.nextLine();
				this.todoList.remove(Integer.valueOf(index));
			}
		}
	}
}