// DictionaryTest.java
import java.util.*;

class DictionaryTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDictionary dictionary = new SimpleDictionary();
		TextUI ui = new TextUI(scanner,dictionary);
		ui.start();
		System.out.println(dictionary.translate("pikka"));

		// 
		// SimpleDictionary dict = new SimpleDictionary();
		// dict.add("pikka","akkapi");
		// dict.add("money","yenom");
	}
}