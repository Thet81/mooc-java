// VarTypeDemo.java
import java.util.*;
class VarTypeDemo {
	public static void main(String[] args) {
		String string = "string-object";
		TextMessage message = new TextMessage("ope", "many types for the same object");

		Readable readableMessage = new TextMessage("ope","The text message is readable");

		//Because an interface can be used as a type, it's possible to create a list that contains objects of the interface's type.

		ArrayList<Readable> readinglist = new ArrayList<>();

		readinglist.add(new TextMessage("ope","never benn programming befor..."));
		readinglist.add(new TextMessage("ope","gonna love it i think!"));
		readinglist.add(new TextMessage("ope","give me something more challenging!"));
		readinglist.add(new TextMessage("ope","you think i can do it?"));
		readinglist.add(new TextMessage("ope","up here we send serveral messages each day"));

		ArrayList<String> pages = new ArrayList<>();
		pages.add("A method can call itself");

		readinglist.add(new Ebook("Introduction to Recursion", pages));

		for (Readable readable : readinglist){
			System.out.println(readable.read());
		}
	}
}