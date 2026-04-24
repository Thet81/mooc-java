// AbbreviationTest.java
import java.util.*;
class AbbreviationTest {
	public static void main(String[] args) {
		Abbreviations abbreviation = new Abbreviations();
		abbreviation.addAbbreviation("e.g.","for example");
		abbreviation.addAbbreviation("etc.", "and so on");
		abbreviation.addAbbreviation("i.e.","more precisely");

		HashMap<String,String> abbr = new HashMap<>();
		abbr.put("f.e","for example");
		abbr.put("etc", "and so on");
		abbr.put("i.e","more precisely");

		Abbreviations.printKeys(abbr);
		System.out.println("-----");
		Abbreviations.printKeysWhere(abbr,"e");

		System.out.println("------");
		Abbreviations.printValueWhere(abbr,".e");
		String text = "e.g. i.e. etc. lol";

		//  for(String part : text.split(" ")){
		// 	if(abbreviation.hasAbbreviation(part)){
		// 		part = abbreviation.findExplanationFor(part);
		// 	}
		// 	System.out.print(part);
		// 	System.out.print("");
		// }
		// System.out.println();
	}
}