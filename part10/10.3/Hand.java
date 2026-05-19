// Hand.java
import java.util.*;

public class Hand {
	public static void main(String[] args) {
		Hand hand = new Hand();
		Cards ten = new Cards(10,Suit.DIAMOND);
		Cards nine = new Cards(9,Suit.HEART);
		Cards two = new Cards(2,Suit.SPADE);
		hand.add(ten);
		hand.add(nine);
		hand.add(two);
		// hand.print();
		hand.removeWorstWithIter(3);
		hand.printWithIter();
	}
	private List<Cards> cards;

	public Hand (){
		this.cards = new ArrayList<>();
	}

	public void add(Cards card){
		this.cards.add(card);
	}

	public void print(){
		this.cards.stream().forEach(card -> {
			System.out.println(card);
		});
	}

	public void printWithIter(){
		Iterator<Cards> iterator = this.cards.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	/** 
	 * this will be problematic - throwing ConcurrentModificationException as 
	 * using a forEach method, it's assumed that the list is not modified during 
	 * the traversal
	*/
	public void removeWorst(int value){
		this.cards.stream().forEach(card -> {
			if (card.getValue() < value){
				this.cards.remove(card);
			}
		});
	}

	public void removeWorstWithIter(int value){
		Iterator<Cards> iterator = cards.iterator();

		while(iterator.hasNext()){
			if(iterator.next().getValue() < value){
				iterator.remove();
			}
		}
	}
}