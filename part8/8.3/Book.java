
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

	@Override
	public boolean equals(Object compardObject){

		if(this == compardObject){
			return true;
		}

		if(!(compardObject instanceof Book)){
			return false;
		}

		Book compardBook = (Book) compardObject;

		if(this.name.equals(compardBook.name) && 
		   this.published == compardBook.published &&
		   this.content.equals(compardBook.content)
		  ){
			return true;
		}

		return false;
	}

	@Override
	public int hashCode(){
		if(this.name == null){
			return this.published;
		}

		return this.name.hashCode();
	}
}