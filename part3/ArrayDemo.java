
class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0] = 2;
		numbers[2] = 5;
		numbers[3] = 4;

		int helper = numbers[0];
		numbers[0] = numbers[3];
		numbers[3] = helper;

		int index = 0;
		while(index < numbers.length) {
			System.out.println(numbers[index]);
			index ++;
		}
	}
}