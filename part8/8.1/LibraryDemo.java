// LibraryDemo.java
import java.util.*;

class LibraryDemo {
	public static void main(String[] args) {
		Library library = new Library();
		Book book = new Book("Pride and prejudice",1943,"...");
		Book senseAndSensibility = new Book("senseAndSensibility",1813,"...");
		HashMap<String,Book> books = new HashMap<>();

		books.put("sense and sensibility", senseAndSensibility);
		books.put("pride and prejudice ",book);
		library.printValuesIfNameContains(books,"preju");
		// library.addBook(book);
		// System.out.println(library.getBookByPart("Pride"));
	}
}