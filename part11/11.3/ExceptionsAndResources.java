// ExceptionsAndResources.java

import java.util.*;
import java.nio.file.*;

public class ExceptionsAndResources{

	public static void main(String[] args) {
		try{
			List<String> lines= readLines("filee.txt");
			lines.forEach(line -> System.out.println(line));
		}catch(Exception e){
			System.out.println("Error reading file :");
		}
	}

	public static List<String> readLines(String fileName) throws Exception{
		List<String> lines = new ArrayList<>();
		Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
		return lines;
	}
}