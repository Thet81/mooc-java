// SuitcaseTest.java

class SuitcaseTest {
	public static void main(String[] args) {
		Item book = new Item("Lord of the rings",2);
		Item phone = new Item("Nokia 3210",1);
		Item brick = new Item("brick",4);

		Suitcase mycase = new Suitcase(4);
		System.out.println(mycase);

		mycase.addItem(book);
		System.out.println(mycase);
		mycase.addItem(phone);
		System.out.println(mycase);
		mycase.addItem(brick);
		System.out.println(mycase);
		// System.out.println(mycase.totalWeight());
		// System.out.println(mycase);
		System.out.println("haviestItem is " + mycase.haviestItem());
		mycase.printItems();
	}
}