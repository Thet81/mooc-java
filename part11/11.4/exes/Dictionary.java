// Dictionary.java
import java.util.*;

public class Dictionary {
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		dict.add("apina","monkey");
		dict.add("banaani","banana");
		dict.add("apina","apfe");

		dict.delete("apina");
		dict.delete("banana");
		System.out.println(dict.translate("apina"));
		System.out.println(dict.translate("monkey"));
		System.out.println(dict.translate("ohjelmointi"));
		System.out.println(dict.translate("banana"));
	}
	private HashMap<String,String> engs;
	private HashMap<String,String> finnish;

	public Dictionary(){
		this.engs = new HashMap<>();
		this.finnish = new HashMap<>();
	}

	public void add(String words, String translation){
		this.engs.putIfAbsent(words,translation);
		this.finnish.putIfAbsent(translation,words);
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
		if(this.engs.containsKey(word)){
			this.engs.remove(word);
		}

		if(this.finnish.containsKey(word)){
			this.finnish.remove(word);
		}
	}
}