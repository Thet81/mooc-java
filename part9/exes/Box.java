// Box.java
import java.util.*;

public abstract class Box {

	public abstract void add(Item item);

	public void add(ArrayList<Item> items) {
		for(Item item : items){
			Box.this.add(item);
		}
	}

	public abstract boolean isInBox(Item item);
}