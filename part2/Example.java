// Example.java
import java.util.*;

class Example {
	public static void main(String[] args) {
		int tulos = 0;
		int i = 0;
		while( i < 4) {
			tulos += 3;
			i ++;
			System.out.println("i is" + i);
			System.out.println("result is "+ tulos);
		}
		System.out.println(tulos);
	}
}