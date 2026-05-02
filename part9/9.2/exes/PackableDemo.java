// PackableDemo.java

class PackableDemo {
	public static void main(String[] args) {
		Book book1 = new Book("Fyodor Dostoevsky","Crime and punishment",2);
		Book book2 = new Book("Rober Martin","Clean Code",1);
		Book book3 = new Book("Kent Beck","Test Driven Development",0.5);

		CD cd1 = new CD("Pink Floyd","Dark Side of the moon",1973);
		CD cd2 = new CD("Wigwam","Nuclear Nightclub",1975);
		CD cd3 = new CD("Ba Din","NayYar",1992);

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);

		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
	}
}