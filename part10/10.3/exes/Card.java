// Card.java
import java.util.*;

public class Card implements Comparable<Card>{

	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();

		Card fifth = new Card(3,Suit.SPADE);
		Card first = new Card(2, Suit.DIAMOND);
		Card second = new Card(3, Suit.CLUB);
		Card third = new Card(1, Suit.SPADE);
		Card fourth = new Card(2, Suit.HEART);
		cards.add(first);
		cards.add(second);
		cards.add(third);
		cards.add(fourth);
		cards.add(fifth);
		// cards.stream().sorted().forEach(c -> System.out.println(c));
		// System.out.println(first);
		Collections.sort(cards);

		cards.stream().forEach(c -> System.out.println(c));
		System.out.println(fourth.getOrdinal());
	}
	private int value;
	private Suit suit;

	public Card (int value, Suit suit){
		this.value = value;
		this.suit = suit;
	}

	public Suit getSuit(){
		return this.suit;
	}

	public int getValue(){
		return this.value;
	}

	@Override
	public String toString(){
		return this.suit + " " + this.value;
	}

	public int getOrdinal (){
		return this.suit.ordinal();
	}
	@Override
	public int compareTo(Card card){
		if (this.value == card.getValue()){
			if(this.getOrdinal() == card.getOrdinal()){
				return 0;
			}else if (this.getOrdinal() > card.getOrdinal()){
				return 1;
			}else {
				return -1;
			}
		}else if (this.value > card.getValue()){
			return 1;
		}else {
			return -1;
		}
	}
}