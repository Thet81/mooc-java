// KeySet.java
import java.util.*;

class KeySet {
	public static void main(String[] args) {
		HashMap<String,String> books = new HashMap<>();
		books.put("Pride and pre","some content");
		books.put("50 ways", "to hate");

		for(String set : books.keySet()){
			if(set.contains("pre")){
				System.out.println("contain");
			}
		}
	}
}