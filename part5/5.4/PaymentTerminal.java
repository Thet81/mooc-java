// PaymentTerminal.java

class PaymentTerminal {
	private double money;
	private int affordableMeals;
	private int heartyMeals;

	public PaymentTerminal() {
		this.money = 1000;
	}

	public boolean eatAffordably(PaymentCard card){
		if(card.balance() >= 2.50){
			if(card.takeMoney(2.50)){
				this.affordableMeals++;
				this.money += 2.50;
				return true;
			}
		}
		return false;
	}
	// eatAffordably(10) -> 10-2.5 7.5
	public double eatAffordably(double payment) {
		if (payment >= 2.5){
			this.money += 2.5;
			this.affordableMeals++;
			return payment - 2.5;
		}
		return 0;
	}

	public boolean eatHeartily(PaymentCard card){
		if (card.balance() >= 4.30){
			if (card.takeMoney(4.30)){
				this.money += 4.30;
				this.heartyMeals++;
				return true;
			}
		}
		return false;
	}

	public double eatHeartily(double payment){
		if (payment >= 4.30) {
			this.money += 4.30;
			this.heartyMeals++;
			return payment - 4.30;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "money : " + money + ", number of sold afforable meals " + affordableMeals + " heartyMeals " + heartyMeals;
	}
}