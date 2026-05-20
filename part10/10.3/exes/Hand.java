// Hand.java
import java.util.*;

public class Hand {

	public static void main(String[] args) {
		Hand hand = new Hand();
		hand.add(new Card(2, Suit.DIAMOND));
		hand.add(new Card(14, Suit.SPADE));
		hand.add(new Card(12, Suit.HEART));
		hand.add(new Card(2, Suit.SPADE));
		hand.sort();
		hand.print();
	}

	private List<Card> cards;

	public  Hand (){
		this.cards = new ArrayList<>();
	}

	public void add(Card card){
		this.cards.add(card);
	}

	public void print(){
		this.cards.stream().forEach(c -> System.out.println(c));
	}

	public void sort(){
		Collections.sort(this.cards);
	}
}
