// BookAuthor.java
import java.util.*;

public class BookAuthor{
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Person james = new Person("James",30);
		Person john = new Person("John",35);

		Book javaProgramming = new Book("Java Programming","John Publishing",james);
		Book jsProgramming = new Book("JavaScript Programming","Acme Publishing",james);
		Book postgresDb = new Book("Postgres","CCP Publishing",john);
		books.add(javaProgramming);
		books.add(jsProgramming);
		books.add(postgresDb);

		books.stream()
			.filter(b -> b.getAuthor().getName().equals("James"))
			.forEach(b -> System.out.println(b));
	}
}