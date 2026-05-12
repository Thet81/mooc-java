// FileReading.java
import java.util.*;
import java.nio.file.*;

public class FileReading {

	public static void main(String[] args) {
		List<String> list = read("sometext.txt");
		list.stream().forEach(row -> System.out.println(row));
	}

	public static List<String> read(String file){
		List<String> rows = new ArrayList<>();

		try {
			Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
		}catch (Exception e){
			System.out.println("Error : " + e.getMessage());
		}

		return rows;
	}
}