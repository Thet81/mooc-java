// FileWrite.java
import java.util.*;
import java.io.*;
public class FileWrite{
	public static void main(String[] args) {
		try(PrintWriter writer = new PrintWriter("file.txt")){
			writer.print("Hello File");
			writer.close();
		}catch(Exception e){
			System.out.println("Error : " + e.getMessage());
		}
	}
}