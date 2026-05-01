// ReadingList.java
import java.util.*;

public class ReadingList implements Readable{

	public static void main(String[] args) {

		ReadingList joinsList = new ReadingList();

		joinsList.add(new TextMessage("arto", "have you written the tests yet?"));
		joinsList.add(new TextMessage("arto", "have you checked the submissions yet?"));

		System.out.println("Joni's to-read" + joinsList.toRead());
		System.out.println("Delegating the reading to Verna");

		// ReadingList vernasList = new ReadingList();
		// vernasList.add(joinsList);

		joinsList.read();
		System.out.println();
		System.out.println("Joni's to-read" + joinsList.toRead());
	}
	private ArrayList<Readable> readables;

	public ReadingList(){
		this.readables = new ArrayList<>();
	}

	public void add(Readable readable){
		this.readables.add(readable);
	}

	public int toRead(){
		return this.readables.size();
	}

	@Override
	public String read(){
		String read = "";
		for(Readable readable : this.readables){
			read = read + readable.read() + "\n";
		}

		this.readables.clear();
		return read;
	}
}