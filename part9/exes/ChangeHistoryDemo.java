// ChangeHistoryDemo.java

class ChangeHistoryDemo {
	public static void main(String[] args) {

		ChangeHistory history = new ChangeHistory();
		history.add(3.0);
		history.add(4.5);
		history.add(7);
		double max = history.maxValue();
		double min = history.minValue();
		double average = history.average();

		System.out.println(history);
		System.out.println("max value is " + max);
		System.out.println("min value is " + min);
		System.out.println("average is " + average);
	}
}