// Book.java
import java.util.*;

public class Book {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Person john = new Person("John","Doe",1997);
		Person james = new Person("James","Doe",1973);
		books.add(new Book(john,"Programming with java",200));
		books.add(new Book(james,"SQL injectiono",200));

		books.stream()
			.map(book -> book.getAuthor().getFirstName() + " : " + book.getName())
			.forEach(b -> System.out.println(b));
	}
	private Person author;
	private String name;
	private int pages;

	public Book(Person author, String name, int pages){
		this.author = author;
		this.name = name;
		this.pages = pages;
	}

	public Person getAuthor(){
		return this.author;
	}

	public String getName(){
		return this.name;
	}

	public int getPages(){
		return this.pages;
	}
}