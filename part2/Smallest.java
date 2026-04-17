// Smallest.java

class Smallest {
	public static void main(String[] args) {
		int answer = smallest(2,7);
		System.out.println("The smallest number is " + answer);
	}

	public static int smallest(int numOne, int numTwo){
		if (numOne < numTwo){
			return numOne;
		}
		return numTwo;
	}
}