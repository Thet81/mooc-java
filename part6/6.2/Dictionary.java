// Dictionary.java

public class Dictionary {
	private String word;
	private String meaning;

	public Dictionary(String word, String meaning){
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord (){
		return this.word;
	}

	public String getMeaning () {
		return this.meaning;
	}
}