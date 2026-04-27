// ProductWarehouseWithHistory.java

public class ProductWarehouseWithHistory extends ProductWarehouse{

	private ChangeHistory history;

	public ProductWarehouseWithHistory(String productName, double capacity,double initialBalance){
		super(productName,capacity);
		this.history = new ChangeHistory();
		addToWarehouse(initialBalance);
		this.history.add(initialBalance);
	}

	public String history(){
		return this.history.toString();
	}
}