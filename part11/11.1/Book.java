// Book.java

public class Book {
	private String title;
	private String publisher;
	private Person author;

	/**
	 * private ArrayList<Person> authors;
	 * 
	*/
	public Book(String title, String publisher, Person author){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	@Override
	public String toString(){
		return this.title;
	}

	public void setAuthor(Person author){
		this.author = author;
	}

	public Person getAuthor(){
		return this.author;
	}
}