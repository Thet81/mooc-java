// Presidents.java
import java.util.*;
import java.nio.file.*;

public class Presidents {

	public static void main(String[] args) {

		List<Person> persons = makePresidentObject("presidents.txt");
		System.out.println(persons);
	}

	 public static List<Person> makePresidentObject(String file){
	 	List<Person> presidents = new ArrayList<>();
	 	try{
	 		// lines method of Files create a stream from the file
	 		Files.lines(Paths.get(file))
	 		// splitting the row into parts on the ";" character
	 		.map(row -> row.split(";"))
	 		// deleting the split rows that have less than two parts 
	 		.filter(parts -> parts.length >= 2)
	 		// creating persons from the parts
	 		.map(parts -> new Person(parts[0],Integer.valueOf(parts[1])))
	 		// and finally add the preresons to the list
	 		.forEach(person -> presidents.add(person));
	 	}catch(Exception e){
	 		System.out.println("Error :" + e.getMessage());
	 	}
	 	return presidents;
	 }
}