// Averging.java

class Averging {
	public static void main(String[] args) {
		double result = average(4,3,6,1);
		System.out.println("The average is "+ result);
	}

	public static int sum (int one,int two, int three, int four){
		return one + two + three + four;
	}

	public static double average (int one, int two, int three, int four){
		int summed = sum(one,two,three,four);
		double result = summed / 4;
		return result;
	}
}