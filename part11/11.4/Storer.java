// Storer.java
import java.io.*;

public class Storer {
	public static void main(String[] args) throws Exception{
		Storer storer = new Storer();
		String text = "This line will be written to the file.";
		storer.writeToFile("file.txt",text);
	}
	public void writeToFile(String fileName, String text) throws Exception{
		PrintWriter writer = new PrintWriter(fileName);
		writer.println(text);
		writer.close();
	}
}