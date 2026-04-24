// Library.java

import java.util.*;

class Library {
	private HashMap<String,Book> directory;

	public Library(){
		this.directory = new HashMap<>();
	}

	public void addBook(Book book){
		String name = sanitizedString(book.getName());
		if(this.directory.containsKey(name)){
			System.out.println("Book is already in the library");
		}else {
			System.out.println("Adding book to the list");
			directory.put(name,book);
		}
	}

	public Book getBook(String bookTitle){
		bookTitle = sanitizedString(bookTitle);
		return this.directory.get(bookTitle);
	}

	public void removeBook(String bookTitle){
		bookTitle = sanitizedString(bookTitle);

		if(this.directory.containsKey(bookTitle)){
			this.directory.remove(bookTitle);
		}else {
			System.out.println("Book was not found, cannot be removed!");
		}
	}

	public static String sanitizedString(String string) {
		if (string == null) {
			return "";
		}

		string = string.toLowerCase();
		string = string.trim();
		return string;
	}

	// public ArrayList<Book> getBookByPart(String titlePart){
	// 	titlePart = sanitizedString(titlePart);

	// 	ArrayList<Book> books = new ArrayList<>();

	// 	for(String bookTitle : this.directory.keySet()){
	// 		if(!(bookTitle.contains(titlePart))){
	// 			continue;
	// 		}

	// 		books.add(this.directory.get(bookTitle));
	// 	}
	// 	return books;
	// }

	public ArrayList<Book> getBookByPart(String titlePart){
		titlePart = sanitizedString(titlePart);
		System.out.println(titlePart);
		ArrayList<Book> books = new ArrayList<>();

		System.out.println(this.directory.values());
		for(Book book : this.directory.values()){
			if(!book.getName().contains(titlePart)){
				continue;
			}

			books.add(book);
		}
		return books;
	}

	public static void printValues (HashMap<String,Book> hashmap){
		for(Book value : hashmap.values()){
			System.out.println(value);
		}
	}

	public static void printValuesIfNameContains(HashMap<String,Book> hashmap,String text){

		for(Book book : hashmap.values()){
			if(!book.getName().contains(text)){
				continue;
			}
			System.out.println(book);
		}
	}
}