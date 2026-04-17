// Item.java

class Item {
	private String name;

	public Item(String itemName) {
		this.name = itemName;
	}

	@Override
	public String toString() {
		return this.name ;
	}
}