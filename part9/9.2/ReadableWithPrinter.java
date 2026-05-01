import java.util.ArrayList;

class ReadableWithPrinter{

	public static void main(String[] args) {
		TextMessage message = new TextMessage("ope","Oh wow, this printer knows how to print both message and ebook that are the type of readable");

		ArrayList<String> pages = new ArrayList<>();
		pages.add("Values common to both {1,3,5} and {2,3,4,5} are {3,5}");

		Ebook book = new Ebook("Introduction to University Mathematics",pages);

		Printer printer = new Printer();
		printer.print(message);
		printer.print(book);
	}
}
