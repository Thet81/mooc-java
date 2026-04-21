// UserInterface.java

import java.util.*;

public class UserInterface {
	private Scanner scanner;
	private WordSet wordSet;

	public UserInterface(Scanner scanner,WordSet wordset){
		this.scanner = scanner;
		this.wordSet = wordset;
	}

	public void start(){

		while(true){
			System.out.println("Enter a word");
			String word = scanner.nextLine();

			if (wordSet.contains(word)){
				break;
			}
			this.wordSet.add(word);
		}
		System.out.println("You gave the same words twice.");
	}

	// public boolean alreadyEntered(String word) {
	// 	if(this.wor.contains(word)){
	// 		return true;
	// 	}
	// 	return false;
	// }
}