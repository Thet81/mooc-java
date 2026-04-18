// BookEqualTest.java
import java.util.*;

class BookEqualTest {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		Book one = new Book ("One",2016);
		
		if(bookList.contains(one)){
			System.out.println("One is on the list");
		}else {
			System.out.println("One is not on the list");
		}

		bookList.add(one);
		if(bookList.contains(one)){
			System.out.println("One is on the list");
		}else {
			System.out.println("One is not on the list");
		}

		System.out.println("However");
		one = new Book("One",2016);

		if(bookList.contains(one)){
			System.out.println("One is on the list");
		}else {
			System.out.println("One is not on the list");
		}
	}
}