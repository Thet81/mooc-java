// Book.java

public class Book {
	private String name;
	private String content;
	private int published;

	public Book(String name, int published, String content){
		this.name = name;
		this.published = published;
		this.content = content;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public void setPublised(int newPublished){
		this.published = newPublished;
	}

	public String getContent(){
		return this.content;
	}

	public void setContent (String newContent) {
		this.content = newContent;
	}

	public String toString(){
		return "Name : " + this.name + " (" + this.published + ")\n" + "Content: " + this.content;
	}
}