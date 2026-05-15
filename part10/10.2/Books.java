// Books.java

public class Books implements Comparable<Books>{
	private String name;
	private int recAge;

	public Books(String name, int recAge){
		this.name = name;
		this.recAge = recAge;
	}

	@Override 
	public String toString(){
		return this.name + "(recommended for " + this.recAge + " year-olds or older)";
	}

	public int getRecAge (){
		return this.recAge;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Books books){
		return this.getRecAge() - books.getRecAge();
	}
}