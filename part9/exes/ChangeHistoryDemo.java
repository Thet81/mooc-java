// ChangeHistoryDemo.java

class ChangeHistoryDemo {
	public static void main(String[] args) {

		ChangeHistory history = new ChangeHistory();
		history.add(3.0);
		history.add(4.5);
		System.out.println(history);
	}
}