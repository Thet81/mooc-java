// BookTest.java
import java.util.*;

class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<>();

		int bookCount = 0;

			while(true){
				System.out.println("Name (Empty will stop)");
				String name = scanner.nextLine();
				if(name.isEmpty()){
					break;
				}
				System.out.println("Publication Year");
				int publicationYear = Integer.valueOf(scanner.nextLine());
		 		Book newBook = new Book(name,publicationYear);

			 	if(bookList.contains(newBook)){
					System.out.println("The book is on the list");
					break;
				}else {
					bookList.add(newBook);
					bookCount++;
				}
				
			}

		System.out.println("Total Books : " + bookCount);
		System.out.println(bookList);
	}
}