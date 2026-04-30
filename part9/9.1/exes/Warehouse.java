// Warehouse.java

public class Warehouse {

	private double capacity;
	private double balance;

	public Warehouse(double capacity){
		if (capacity <=0 ) {
			this.capacity = 0;
		}
		this.capacity = capacity;
	}

	public double getBalance () {
		return this.balance;
	}

	public double getCapacity (){
		return this.capacity;
	}

	public double howMuchSpaceLeft(){
		return this.capacity - balance;
	}

	public void addToWarehouse(double amount){
		if(!(amount < 0 || amount > this.capacity)){
			this.balance += amount;
		}
	}

	public double takeFromWarehouse(double amount){
		if(amount < 0) {
			return 0;
		}

		if(amount > this.capacity){
			double amt = this.balance;
			this.balance = 0;
			return amt;
		}
		this.balance -= amount;
		return amount;
	}

	@Override
	public String toString(){
		return "balance = " + this.balance + ", space left " + this.howMuchSpaceLeft(); 
	}
}