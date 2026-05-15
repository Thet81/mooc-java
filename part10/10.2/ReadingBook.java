// ReadingBook.java

import java.util.*;

public class ReadingBook {
	public static void main(String[] args) {
		start();
	}

	public static void start(){
		List<Books> books = new ArrayList<>();
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input the name of the book, empty stops : ");
			String name = scanner.nextLine();
			if(name.isEmpty()){
				break;
			}
			System.out.print("Input the age recommendation : ");
			int age = Integer.valueOf(scanner.nextLine());
			books.add(new Books(name,age));
		}
		System.out.println(books.size() + " books in total");
		System.out.println();
		System.out.println("Books:");

		Comparator<Books> comparator = Comparator
			.comparing(Books::getRecAge)
			.thenComparing(Books::getName);

		Collections.sort(books,comparator);
		books.stream()
			.forEach(b -> System.out.println(b));
	}
}