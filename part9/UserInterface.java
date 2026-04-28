// UserInterface.java
import java.util.*;

public class UserInterface{
	private Scanner scanner;
	private ArrayList<Operation> operations;

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface(new Scanner(System.in));
		userInterface.addOperation(new PlusOperation());

		userInterface.start();
	}
	public UserInterface(Scanner scanner){
		this.scanner = scanner;
		this.operations = new ArrayList<>();
	}

	public void addOperation(Operation operation){
		this.operations.add(operation);
	}

	public void start(){
		while(true){
			printOperations();
			System.out.println("Choice : ");

			String choice = this.scanner.nextLine();
			if (choice.equals("0")){
				break;
			}
			executeOperaion(choice);
			System.out.println();
		}
	}

	public void printOperations(){
		System.out.println("\t0:Stop");
		int index = 0;

		while (index < this.operations.size()){
			String operationName = this.operations.get(index).getName();
			System.out.println("\t" + (index + 1) + ":" + operationName);
			index++;
		}
	}

	private void executeOperaion(String choice){
		int operation = Integer.valueOf(choice);

		Operation chosen = this.operations.get(operation-1);
		chosen.execute(scanner);
	}
}
