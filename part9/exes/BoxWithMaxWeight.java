// BoxWithMaxWeight.java

import java.util.*;

public class BoxWithMaxWeight extends Box{

	private int maxWeight;
	private ArrayList<Item> items;

	public BoxWithMaxWeight(int maxWeight){
		this.maxWeight = maxWeight;
		this.items = new ArrayList<>();
	}

	@Override
	public void add(Item item){

		int totalWeightInThisBox = item.getWeight();

		for (Item boxItem : this.items){
			totalWeightInThisBox += boxItem.getWeight();
		}

		if(totalWeightInThisBox <= maxWeight){
			this.items.add(item);
		}
	}

	@Override
	public boolean isInBox(Item item){
		if(this.items.contains(item)){
			return true;
		}
		return false;
	}
}