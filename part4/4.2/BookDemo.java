// BookDemo.java

import java.util.*;

class BookDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the details of the book : ");
		ArrayList<Book> books = new ArrayList<>();

		while (true) {
			String details = scanner.nextLine();

			if (details.isEmpty()){
				break;
			}

			String[] parts = details.split(",");
			String title = parts[0];
			int pages = Integer.valueOf(parts[1]);
			int publicationYear = Integer.valueOf(parts[2]);

			books.add(new Book(title,pages,publicationYear));
		}

		System.out.println("What information will be printed ? ");
		String filterWord = scanner.nextLine();

		for(Book book : books) {
			if (filterWord.equals("everything")){
				System.out.println(book.getAllInfo());
			}else if (filterWord.equals("name")){
				System.out.println(book.getTitle());
			}
		}
	}
}
