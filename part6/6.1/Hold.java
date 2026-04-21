// Hold.java
import java.util.*;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> cases;

	public Hold(int maxWeight){
		this.maxWeight = maxWeight;
		this.cases = new ArrayList<>();
	}

	public void addSuitcase(Suitcase suitcase){
		int total = this.totalWeight();
		if(total + suitcase.totalWeight() <= this.maxWeight){
			this.cases.add(suitcase);
		}
	}

	public int totalWeight () {
		int total = 0;
		for(Suitcase suitcase : this.cases){
			total += suitcase.totalWeight();
		}
		return total;
	}

	public void printItems () {
		for(Suitcase suitcase : this.cases){
			suitcase.printItems();
		}
	}

	@Override
	public String toString(){
		String formatted = " suitcase";
		if(this.cases.size() > 1) {
			formatted += "s";
		}
		return this.cases.size() + formatted + " (" + this.totalWeight() + "kg)";
	}

}