// DebtDemo.java

class DebtDemo {
	public static void main(String[] args) {
		Debt morttage = new Debt(120000.0, 1.20);
		morttage.printBalance();

		morttage.waitOneYear();
		morttage.printBalance();

		int years = 0;

		while (years < 20) {
			morttage.waitOneYear();
			years = years + 1;
		}

		morttage.printBalance();
	}
}