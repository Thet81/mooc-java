// LockerDemo.java

public class LockerDemo{
	public static void main(String[] args) {
		Locker<String> string = new Locker<>();
		string.setValue(":)");
		System.out.println(string.getValue());

		Locker<Integer> integ = new Locker<>();
		integ.setValue(3);
		System.out.println(integ.getValue());
	}
}