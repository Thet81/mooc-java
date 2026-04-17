// StackSumming.java

class StackSumming {
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		int first = 1;
		int second = 6;

		int result = sum(first,second);
		System.out.println("Sum : " + result);
	}

	public static int sum (int first, int second) {
		return first + second;
	}
}