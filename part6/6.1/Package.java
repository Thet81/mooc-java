// Package.java
import java.util.*;

public class Package {

	private ArrayList<Gift> packages;

	public Package() {
		this.packages = new ArrayList<>();
	}

	public void addGift(Gift gift) {
		this.packages.add(gift);
	}

	public int totalWeight () {
		int totalWeight = 0;

		for (Gift gift : this.packages){
			totalWeight += gift.getWeight();
		}

		return totalWeight;
	}
}