// BookBorrowers.java

import java.util.*;

class BookBorrowers {
	public static void main(String[] args) {
		HashMap<Book,String> borrowers = new HashMap<>();
		Book bookObject = new Book("Book Object",2000,"...");
		borrowers.put(bookObject,"Pekka");
		Book tdd = new Book("Test Driven Development",1999,"...");
		borrowers.put(tdd,"Arto");

		System.out.println(borrowers.get(bookObject));
		System.out.println(new Book("Test Driven Development",1999,"..."));
		// System.out.println(borrowers.get(new Book("Test Driven Development",1999,"...")));
	}
}