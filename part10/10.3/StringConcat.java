// StringConcat.java

public class StringConcat{
	public static void main(String[] args) {
		String number = "";
		// 4 new strings are created and space is allocated in memory for each string
		for (int i = 1; i < 5; i++){
			number += i;
		}
		System.out.println(number);

		// we can solve this problem by using ready-made class called StringBuilder

		StringBuilder concatedString = new StringBuilder();

		for(int i = 1 ; i < 5; i++){
			concatedString.append(i);
		}

		System.out.println(concatedString.toString());
	}
}