// Main.java

class Main {
	public static void main(String[] args) {
		Person ada = new Person("Ada");
		Person antti = new Person("Antti");
		Person martin = new Person("Martin");

		ada.printPerson();
		antti.printPerson();
		martin.printPerson();

		ada.growOlder();
		ada.growOlder();
		antti.growOlder();

		ada.printPerson();
		antti.printPerson();
		Whistle kvaak = new Whistle("Kvaak");
		Whistle peef = new Whistle("Peef");
		Whistle Kvaak = new Whistle("Kvaak");

		kvaak.sound();
		peef.sound();
		Kvaak.sound();

		Door alexander = new Door();
		alexander.knock();

		Product banana = new Product(1.1,13,"Banana");
		banana.printProduct();
	}
}