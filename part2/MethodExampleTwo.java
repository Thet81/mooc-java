// MethodExampleTwo.java

class MethodExampleTwo {
	public static void main(String[] args) {
		int number = 1;
		System.out.println("The value of the varible number in the main program : "+ number);
		incrementByThree(number);
		System.out.println("The value of the varible number in the main program :" + number);
	}
	// pass by value <copy>
	public static void incrementByThree(int number) {
		System.out.println("The value of the method parameter : "+number);
		number += 3;
		System.out.println("The value of the method parameter " + number);
	}
}