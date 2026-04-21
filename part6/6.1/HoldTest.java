// HoldTest.java

class HoldTest {
	public static void main(String[] args) {
		Item book = new Item("Lord of the rings",2);
		Item phone = new Item("Nokia 3210",1);
		Item brick = new Item("brick",4);

		Suitcase adsCase = new Suitcase(10);
		adsCase.addItem(book);
		adsCase.addItem(phone);

		Suitcase pekkasCase = new Suitcase(10);
		pekkasCase.addItem(brick);

		Hold hold = new Hold(1000);
		hold.addSuitcase(adsCase);
		hold.addSuitcase(pekkasCase);

		System.out.println(hold);

		hold.printItems();
	}
}