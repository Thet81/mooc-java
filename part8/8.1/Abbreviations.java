// Abberivations.java
import java.util.*;

public class Abbreviations {

	private HashMap<String,String> abbreviations;

	public Abbreviations(){
		this.abbreviations = new HashMap<>();
	}

	public void addAbbreviation(String abbreviation, String explanation){
		abbreviation = sanitizedString(abbreviation);
		explanation = sanitizedString(explanation);

		if(this.abbreviations.containsKey(abbreviation)){
			System.out.println("Abberivation is already in the list.");
		}else {
			this.abbreviations.put(abbreviation,explanation);
		}
	}

	public boolean hasAbbreviation(String abbreviation){
		abbreviation = sanitizedString(abbreviation);
		if(this.abbreviations.containsKey(abbreviation)){
			return true;
		}
		return false;
	}

	public String findExplanationFor(String abbreviation){
		abbreviation = sanitizedString(abbreviation);
		if(this.hasAbbreviation(abbreviation)){
			return this.abbreviations.get(abbreviation);
		}
		return null;
	}

	public static void printKeys(HashMap<String,String> hashmap){
		for(String key : hashmap.keySet()){
			System.out.println(key);
		}
	}

	public static void printKeysWhere(HashMap<String,String> hashmap, String text){
		for(String key : hashmap.keySet()){
			if(key.contains(text)){
				System.out.println(key);
			}
		}
	}

	public static void printValueWhere(HashMap<String,String> hashmap, String text){
		for(String key : hashmap.keySet()){
			if(key.contains(text)){
				String value = hashmap.get(key);
				System.out.println(value);
			}
		}
	}

	public static String sanitizedString(String string) {
		if(string == null){
			return "";
		}
		string = string.toLowerCase();
		string = string.trim();
		return string;
	}
}