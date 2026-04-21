// MenuTest.java

class MenuTest {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addMeal("Tofu ratatouille");
		menu.addMeal("chilli coconut chicken");

		menu.printMeals();
		menu.clearMenu();

		System.out.println(menu);
	}
}