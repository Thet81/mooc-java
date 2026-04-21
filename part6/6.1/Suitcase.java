// Suitcase.java
import java.util.*;

public class Suitcase{
	private int maxWeight;
	ArrayList<Item> items;

	public Suitcase(int maxWeight) {
		this.items = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	public void addItem(Item item){
		int total = this.totalWeight();
		if(total + item.getWeight() <= maxWeight){
			this.items.add(item);
		}
	}

	public Item haviestItem(){
		if(this.items.isEmpty()){
			return null;
		}

		Item haviest = this.items.get(0);

		for(Item item : this.items) {
			if(item.getWeight() > haviest.getWeight()){
				haviest = item;
			}
		}
		return haviest;
	}

	public int totalWeight () {
		int totalWeight = 0;
		for(Item item : items){
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}

	public void printItems () {
		for(Item item : items) {
			System.out.println(item);
		}
	}

	public String toString(){
		String format = " item";
		if(this.items.size() > 1){
			format += "s";
		}
		return this.items.size() + format + " (" + this.totalWeight() + "kg)";
	}
}