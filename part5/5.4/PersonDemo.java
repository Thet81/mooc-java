
class PersonDemo {
	public static void main(String[] args) {
		Person joan = new Person("John Ball");
		System.out.println(joan);

		Person ball = joan;
		ball.growOlder();
		ball.growOlder();

		System.out.println(joan);

		joan = new Person("John Ball B");
		System.out.println(joan);

		ball = null;
		ball.growOlder();
		System.out.println(ball);
	}
}