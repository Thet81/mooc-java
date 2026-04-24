// BookTestDemo.java
import java.util.*;

class BookTestDemo {
	public static void main(String[] args) {
		Book bookObject = new Book("Book Object",2000,"...");
		Book anotherBookObject = new Book("Book Object",2000,"...");

		if(bookObject.equals(anotherBookObject)){
			System.out.println("The books are the same");
		}else {
			System.out.println("The books aren't the same");
		}

		ArrayList<Book> books = new ArrayList<>();
		books.add(bookObject);

		if(books.contains(bookObject)){
			System.out.println("Book object was found");
		}

		bookObject = new Book("Book Object",2000,"...");

		if(!books.contains(bookObject)){
			System.out.println("Book Object was not found.");
		}
	}
}