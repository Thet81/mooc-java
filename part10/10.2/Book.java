// Book.java
import java.util.*;

public class Book implements Comparable<Book> {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		Book javaProgramming = new Book("java Programming",600);
		Book jsProgramming = new Book("js Programming",300);

		books.add(javaProgramming);
		books.add(jsProgramming);

		books.stream().forEach(b -> System.out.println(b));

		Collections.sort(books);

		books.stream().forEach(b -> System.out.println(b));
	}
	public int numberOfPages;
	public String name;

	public Book (String name, int numberOfPages){
		this.name = name;
		this.numberOfPages = numberOfPages;
	}
	public Book(int numberOfPages){
		this("",numberOfPages);
	}

	@Override
	public String toString(){
		return this.name;
	}
	@Override
	public int compareTo(Book book){
		if(this.numberOfPages == book.numberOfPages){
			return 0;
		}else if (this.numberOfPages > book.numberOfPages){
			return 1;
		}else {
			return -1;
		}
	}
}