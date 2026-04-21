// GiftTest.java

class GiftTest {
	public static void main(String[] args) {
		Gift book = new Gift("Harry Potter and the Philosopher's Stone",2);
		Gift pen = new Gift("A pen from my friend",1);
		System.out.println(book);
		Package gifts = new Package();
		gifts.addGift(book);
		gifts.addGift(pen);
		System.out.println(gifts.totalWeight());
	}
}