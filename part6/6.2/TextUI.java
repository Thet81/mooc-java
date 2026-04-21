// TextUI.java
import java.util.*;
public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dictionary;

	public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
		this.scanner = scanner;
		this.dictionary = simpleDictionary;
	}

	public void start() {
		while(true){
			System.out.print("Command : ");
			String input = this.scanner.nextLine();
			if(input.equals("end")){
				System.out.println("Bye bye!");
				break;
			}

			if(input.equals("add")){
				System.out.print("Word : ");
				String word = scanner.nextLine();
				System.out.print("Translation : ");
				String translation = scanner.nextLine();
				this.dictionary.add(word,translation);
				continue;
			}

			if(input.equals("search")){
				System.out.println("To be translated");
				String toBeTranslated = scanner.nextLine();
				Dictionary translation = this.dictionary.translate(toBeTranslated);
				
				if(translation == null) {
					System.out.println("Translation word (" + toBeTranslated + ") was not found!");
				}else {
					System.out.println("Translation is " + translation.getMeaning());
				}
				continue;
			}
			System.out.println("Unkwnon command");
		}
	}
}