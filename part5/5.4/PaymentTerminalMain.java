// PaymentTerminalMain.java

class PaymentTerminalMain {
	public static void main(String[] args) {
		PaymentTerminal unicafeExactum = new PaymentTerminal();
		double change = unicafeExactum.eatAffordably(10);
		System.out.println("remaining change " + change);

		change = unicafeExactum.eatAffordably(5);
		System.out.println("remaining change "+ change);

		change = unicafeExactum.eatHeartily(4.3);
		System.out.println("remaining change" + change);
		System.out.println(unicafeExactum);

		PaymentCard annesCard = new PaymentCard(7);
		boolean wasSuccessful = unicafeExactum.eatAffordably(annesCard);
		System.out.println("there was enough money : " + wasSuccessful);
		wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money : " + wasSuccessful);
		wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money : " + wasSuccessful);

		unicafeExactum.addMoneyToCard(annesCard,100);

		wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money : " + wasSuccessful);
		System.out.println(unicafeExactum);
		System.out.println(annesCard.balance());
	}
}