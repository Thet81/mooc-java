// Item.java

public class Item {
	String identification;
	String name;

	public Item(String id, String name) {
		this.identification = id;
		this.name = name;
	}

	public boolean equals(Object compared){
		if (this == compared){
			return true;
		}

		if(!(compared instanceof Item)){
			return false;
		}

		Item comparedItem = (Item) compared;

		if(this.identification.equals(comparedItem.identification)){
			return true;
		}

		return false;
	}

	public String toString() {
		return this.identification + ":" + this.name;
	}
}