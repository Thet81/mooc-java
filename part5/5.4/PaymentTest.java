// PaymentTest.java

class PaymentTest {
	public static void main(String[] args) {
		PaymentCard peteCards = new PaymentCard(10);

		System.out.println("money "+ peteCards.balance());

		boolean wasSuccessful = peteCards.takeMoney(8);
		System.out.println("successfully withdrew" + wasSuccessful);
		System.out.println("money " + peteCards.balance());
		System.out.println("");

		wasSuccessful = peteCards.takeMoney(4);
		System.out.println("successfully withdrew "+wasSuccessful);
		System.out.println("money "+ peteCards.balance());
	}
}