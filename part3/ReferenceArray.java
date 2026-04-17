// ReferenceArray.java

class ReferenceArray {
	public static void main(String[] args) {
		int [] numbers = {1,2,3};
		System.out.println("Before swapping");
		int index = 0;
		while (index < numbers.length) {
			System.out.println(numbers[index]);
			index ++;
		}
		swap(numbers);
		System.out.println("After swapping");

		index = 0;
		while (index < numbers.length) {
			System.out.println(numbers[index]);
			index ++;
		}
	}

	public static void swap(int[] intArray) {
		int helper = intArray[0];
		intArray[0] = intArray[1];
		intArray[1] = helper;
	}
}