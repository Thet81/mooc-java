// Literacy.java
import java.util.*;
import java.nio.file.*;

public class Literacy {

	public static void main(String[] args) {
		List<People> peoples = makePeople("literacy.txt");
		peoples.stream()
		.sorted((p1,p2)-> {
			return Double.compare(p1.getRate(),p2.getRate());
		})
		.forEach(p -> System.out.println(p));
		System.out.println();
		Collections.sort(peoples);
		peoples.stream().forEach(p -> System.out.println(p));
	}

	public static List<People> makePeople(String file){
		List<People> people = new ArrayList<>();

		try{
			Files.lines(Paths.get(file))
			.map(row -> row.split(","))
			.map(row -> new People(row[0],row[1],Double.valueOf(row[2])))
			.forEach(person -> people.add(person));
		}catch (Exception e){
			System.out.println("Error : " + e.getMessage());
		}
		return people;
	}
}