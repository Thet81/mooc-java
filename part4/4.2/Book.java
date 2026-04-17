// Book.java

public class Book {
	private String title;
	private int numOfPages;
	private int publicationYear;

	public Book(String bTitle, int numOfPages, int publicationYear) {
		this.title = bTitle;
		this.numOfPages = numOfPages;
		this.publicationYear = publicationYear;
	}

	public String getAllInfo () {
		return this.title + ", " + this.numOfPages + ", " + this.publicationYear;
	}

	public String getTitle () {
		return this.title;
	}
}