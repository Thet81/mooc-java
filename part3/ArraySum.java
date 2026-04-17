// ArraySum.java

class ArraySum {
	public static void main(String[] args) {
		int[] numbers = {5,1,3,4,2};
		sumOfNumbersInArray(numbers);
	}

	public static void sumOfNumbersInArray(int[] integerArray) {
		System.out.println("The sum of the array is");
		int sum = 0;
		int index = 0;
		while(index < integerArray.length) {
			sum += integerArray[index];
			index ++;
		}
		System.out.println(sum);
	}
}