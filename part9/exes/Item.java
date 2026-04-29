// Item.java

public class Item {

	private String name;
	private int weight;

	public Item (String name) {
		this(name,0);
	}
	public Item(String name,int weight){
		this.name = name;
		this.weight = weight;
	}

	public int getWeight(){
		return this.weight;
	}

	@Override
	public String toString(){
		return this.name;
	}

	@Override
	public boolean equals(Object compared) {
		if (this == compared){
			return true;
		}

		if (!(compared instanceof Item)){
			return false;
		}

		Item comparedItem = (Item) compared;

		if (this.name.equals(comparedItem.name)){
			return true;
		}

		return false;
	}

	@Override
	public int hashCode(){
		return this.name.hashCode();
	}
}