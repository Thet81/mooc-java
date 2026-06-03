// Dictionary.java
import java.util.*;

public class Dictionary {
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		dict.add("apina","monkey");
		dict.add("banaani","banana");
		dict.add("ohjelmointi","programming");

		dict.delete("apina");
		dict.delete("banana");
		System.out.println(dict.translate("apina"));
		System.out.println(dict.translate("monkey"));
		System.out.println(dict.translate("banana"));
		System.out.println(dict.translate("banaani"));
		System.out.println(dict.translate("ohjelmointi"));

	}
	private HashMap<String,String> engs;
	private HashMap<String,String> finnish;

	public Dictionary(){
		this.engs = new HashMap<>();
		this.finnish = new HashMap<>();
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

	// public void delete(String word){
	// 	if(this.engs.containsKey(word)){
	// 		this.engs.remove(word);
	// 		this.finnish.remove(translate(word));
	// 	}else if (this.engs.containsValue(word)){
	// 		System.out.println("yes it contains in eng" + word);
	// 		this.engs.remove(translate(word));
	// 	}

	// 	if(this.finnish.containsKey(word)){
	// 		System.out.println("it also run here");
	// 		this.finnish.remove(word);
	// 		this.engs.remove(translate(word));
	// 	}else if (this.finnish.containsValue(word)){
	// 		this.finnish.remove(translate(word));
	// 	}
	// }


	public void delete(String word){
		String toEng = this.finnish.get(word);
		String toFinnish = this.engs.get(word);

		this.finnish.remove(word);
		this.engs.remove(word);

		this.engs.remove(toEng);
		this.finnish.remove(toFinnish);
	}

}