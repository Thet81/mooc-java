// Book.java

public class Book implements Readable{
	private String name;
	// private String author;
	private int pageCount;
	private Person author;

	@Override
	public void read(){
		System.out.println("Read");
	}
}