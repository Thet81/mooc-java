// BookDemo.java

package library;
import library.domain.Book;

public class BookDemo{
	public static void main(String[] args){
		Book book = new Book("the ABCs of packages!");
		System.out.println("Hello packageworld: " + book.getName());
	}
}