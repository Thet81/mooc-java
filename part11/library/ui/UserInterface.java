// UserInterface.java

package library.ui;
import java.util.*;

public class UserInterface {
	private Scanner scanner;

	public UserInterface(Scanner scanner){
		this.scanner = scanner;
	}

	public void start(){
		printTitle();
	}
	// package access modifier or default access modifier
	void printTitle(){
		System.out.println("*********");
		System.out.println("* LIBRARY *");
		System.out.println("*********");
	}
}