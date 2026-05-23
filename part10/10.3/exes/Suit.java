// Suit.java

public enum Suit {
	CLUB("Club"), DIAMOND("Diamond"), HEART("Heart"), SPADE("Spade");

	private String name;

	private Suit(String name){
		this.name = name;
	}

	public String getName (){
		return this.name;
	}
}