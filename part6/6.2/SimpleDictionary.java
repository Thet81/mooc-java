// SimpleDictionary.java
import java.util.*;

public class SimpleDictionary {
	ArrayList<Dictionary> dictionaries;

	public SimpleDictionary() {
		this.dictionaries = new ArrayList<>();
	}
	public void add(String word, String meaning){
		Dictionary newDictionary = new Dictionary(word,meaning);
		this.dictionaries.add(newDictionary);
	}

	public Dictionary translate(String word){
		Dictionary match = null;

		for(Dictionary dict: this.dictionaries){
			if(dict.getWord().equals(word)){
				match = dict;
			}
		}
		if(match == null){
			return null;
		}else {
			return match;
		}
	}

	// public Dictionary translate(String word) {

	// 	for(Dictionary dict : this.dictionaries){

	// 	}
	// }
}