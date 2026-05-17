// Cards.java

public class Cards {

	public static void main(String[] args) {
		Cards first = new Cards(10, Suit.HEART);
		System.out.println(first);

		if (first.getSuit() == Suit.SPADE){
			System.out.println("is a spade");
		}else {
			System.out.println("is not a spade");
		}

		System.out.println(Suit.DIAMOND.ordinal());
		System.out.println(Suit.HEART.ordinal());
	}
	private int value;
	private Suit suit;

	public Cards (int value, Suit suit){
		this.value = value;
		this.suit = suit;
	}

	@Override
	public String toString(){
		return suit + " " + value;
	}

	public Suit getSuit(){
		return suit;
	}

	public int getValue(){
		return this.value;
	}
}