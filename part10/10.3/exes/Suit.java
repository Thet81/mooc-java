// Suit.java

public enum Suit {
	CLUB(""), DIAMOND("J"), HEART("Q"), SPADE("A");

	private String code;

	private Suit(String code){
		this.code = code;
	}

	public String getCode (){
		return this.code;
	}
}