// BoxDemo.java

class BoxDemo {
	public static void main(String[] args) {
		BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
		coffeeBox.add(new Item("Saludo",5));
		coffeeBox.add(new Item("Pirkka",5));
		coffeeBox.add(new Item("Kopi Luwak",5));

		System.out.println("expected to be true and the result is " + coffeeBox.isInBox(new Item("Saludo")));
		System.out.println("expected to be true and the result is " + coffeeBox.isInBox(new Item("Pirkka")));
		System.out.println("expected to be false and the result is " +coffeeBox.isInBox(new Item("Kopi Luwak")));

		System.out.println();

		OneItemBox box = new OneItemBox();
		box.add(new Item("Saludo",5));
		box.add(new Item("Pirkka",5));

		System.out.println("expected to be true and the result is " + box.isInBox(new Item("Saludo")));
		System.out.println("expected to be false and the result is " + box.isInBox(new Item("Pirkka")));

		System.out.println();
		
		MisplacingBox misplacingBox = new MisplacingBox();
		misplacingBox.add(new Item("Saludo",5));
		misplacingBox.add(new Item("Pirkka",5));

		System.out.println("expected to be false and the result is " + misplacingBox.isInBox(new Item("Saludo")));
		System.out.println("expected to be false and the result is " + misplacingBox.isInBox(new Item("Pirkka")));
	}
}