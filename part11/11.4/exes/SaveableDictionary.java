// Dictionary.java
import java.util.*;
import java.nio.file.*;

public class SaveableDictionary {
	public static void main(String[] args) {
		SaveableDictionary dict = new SaveableDictionary("dict.txt");
		boolean wasSuccessful = dict.load();

		if(wasSuccessful){
			System.out.println("Successfully loaded the dictionary from file");
		}
		
		System.out.println(dict.translate("apina"));
		System.out.println(dict.translate("ohjelmointi"));
		System.out.println(dict.translate("alla oleva"));
	}
	private HashMap<String,String> engs;
	private HashMap<String,String> finnish;
	private String file;

	public SaveableDictionary(String file){
		this();
		this.file = file;
	}

	public SaveableDictionary(){
		this.engs = new HashMap<>();
		this.finnish = new HashMap<>();
	}

	public boolean load(){
		try {
			Scanner fileReader = new Scanner(Paths.get(file));
			while(fileReader.hasNextLine()){
				String line = fileReader.nextLine();
				String [] parts = line.split(":");
				// System.out.println(parts[0]);
				add(parts[0],parts[1]);
			}
			return true;
		}catch(Exception e){
				System.out.println(e);
				return false;
		}
	}
	public void add(String words, String translation){
		this.finnish.putIfAbsent(words,translation);
		this.engs.putIfAbsent(translation,words);
	}

	public String translate(String word){
		if(this.engs.containsKey(word)){
			return this.engs.get(word);
		}

		if(this.finnish.containsKey(word)){
			return this.finnish.get(word);
		}
		return null;
	}

	public void delete(String word){
		String toEng = this.finnish.get(word);
		String toFinnish = this.engs.get(word);

		this.finnish.remove(word);
		this.engs.remove(word);

		this.engs.remove(toEng);
		this.finnish.remove(toFinnish);
	}

}