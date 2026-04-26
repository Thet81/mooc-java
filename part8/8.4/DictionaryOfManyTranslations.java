// DictionaryOfManyTranslations.java

import java.util.*;

public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> dictionary;

	public static void main(String[] args) {
		DictionaryOfManyTranslations dict = new DictionaryOfManyTranslations();
		dict.add("lie","maata");
		dict.add("lie","valehdella");
		dict.add("bow","lffkee");

		dict.remove("bow");
		System.out.println(dict.translate("lie"));
		System.out.println(dict.translate("bow"));
	}
	public DictionaryOfManyTranslations(){
		this.dictionary = new HashMap<>();
	}

	public void add(String word, String translation){
		this.dictionary.putIfAbsent(word,new ArrayList<>());

		ArrayList<String> translations = this.dictionary.get(word);
		translations.add(translation);
	}

	public void remove(String word){
		if(!(this.dictionary.get(word) == null)){
			this.dictionary.remove(word);
		}
	}

	public ArrayList<String> translate(String word) {
		if(!(this.dictionary.get(word) == null)){
			return this.dictionary.get(word);
		}
		return new ArrayList<>();
	}
}