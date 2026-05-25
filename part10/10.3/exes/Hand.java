// Hand.java
import java.util.*;

public class Hand implements Comparable<Hand> {

	public static void main(String[] args) {
		Hand hand = new Hand();
		// hand.add(new Card(2, Suit.DIAMOND));
		// hand.add(new Card(14, Suit.SPADE));
		// hand.add(new Card(12, Suit.HEART));
		// hand.add(new Card(2, Suit.SPADE));
		// hand.sort();
		// hand.print();
		hand.add(new Card(12,Suit.HEART));
		hand.add(new Card(4,Suit.SPADE));
		hand.add(new Card(2,Suit.DIAMOND));
		hand.add(new Card(14,Suit.SPADE));
		hand.add(new Card(7,Suit.HEART));
		hand.add(new Card(2,Suit.SPADE));

		hand.sortBySuit();
		hand.print();
	}

	private List<Card> cards;

	public Hand (){
		this.cards = new ArrayList<>();
	}

	public void add(Card card){
		this.cards.add(card);
	}

	public void print(){
		this.cards.stream().forEach(c -> System.out.println(c));
	}

	public int sumOfCardValues(){
		int sum = 0;
		for(Card card : this.cards){
			sum += card.getValue();
		}
		return sum;
	}

	public void sort(){
		Collections.sort(this.cards);
	}

	@Override
	public int compareTo(Hand otherHand){
		return Integer.compare(this.sumOfCardValues(), otherHand.sumOfCardValues());
	}

	public void sortBySuit(){
		Collections.sort(this.cards,(c1,c2)->{
			if (c1.getOrdinal() == c2.getOrdinal()){
				if(c1.getValue() == c2.getValue()){
					return 0;
				}else if (c1.getValue() > c2.getValue()){
					return 1;
				}else {
					return -1;
				}
			}else if (c1.getOrdinal() > c2.getOrdinal()){
				return 1;
			}else {
				return -1;
			}
			});
	}

	// public void sortBySuit(){
	// 	Collections.sort(this.cards,(c1,c2)-> c1.getSuit().ordinal() - c2.getSuit().ordinal());
	// }
	// public void sortBySuit(){
	// 	Comparator<Card> comparator = Comparator
	// 		.comparing(Card::getValue)
	// 		.thenComparing(Card::getOrdinal);

	// 	Collections.sort(this.cards,comparator);
	// }

}


