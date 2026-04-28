// ProductWarehouseWithHistory.java

public class ProductWarehouseWithHistory extends ProductWarehouse{

	private ChangeHistory history;

	public ProductWarehouseWithHistory(String productName, double capacity,double initialBalance){
		super(productName,capacity);
		this.history = new ChangeHistory();
		super.addToWarehouse(initialBalance);
		this.history.add(initialBalance);
	}

	@Override
	public void addToWarehouse(double amount){
		super.addToWarehouse(amount);
		double total = getBalance();
		this.history.add(total);
	}

	@Override
	public double takeFromWarehouse(double amount){
		double removedAmount = super.takeFromWarehouse(amount);
		double balance = getBalance();
		this.history.add(balance);
		return removedAmount;
	}

	public String history(){
		return this.history.toString();
	}

	public void printAnalysis(){
		System.out.println("Product : " + getName() + "\n" + this.history() + "\n" + "Largest amount of product : " + this.history.maxValue() +"\n" + "Smallest amount of prodcut : " + this.history.minValue() + "\n" + "Average :" + this.history.average());
	}
}