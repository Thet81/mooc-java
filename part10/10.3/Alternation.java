// Alternation.java

public class Alternation {
	public static void main(String[] args) {
		String stringOne = "00";

		if(stringOne.matches("00||111||0000")){
			System.out.println("The string contained one of the three alternatives");
		}else {
			System.out.println("The string contained none of the alternatives");
		}
	}
}