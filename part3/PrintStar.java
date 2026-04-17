// PrintStar.java

class PrintStar {
	public static void main(String[] args) {
		int [] array = {5,30,3,4,2,7,20};
		printArrayInStar(array);
	}

	public static void printArrayInStar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}