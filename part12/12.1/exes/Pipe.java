// Pipe.java
import java.util.*;

public class Pipe<T> {
	public static void main(String[] args) {
		Pipe<String> pipe = new Pipe<>();
		pipe.putIntoPipe("dibi");
		pipe.putIntoPipe("dab");
		pipe.putIntoPipe("dab");
		pipe.putIntoPipe("daa");

		while(pipe.isInPipe()){
			System.out.println(pipe.takeFromPipe());
		}

		System.out.println("-------");
		Pipe<Integer> numberPipe = new Pipe<>();
		numberPipe.putIntoPipe(1);
		numberPipe.putIntoPipe(2);
		numberPipe.putIntoPipe(3);

		int sum = 0;
		while(numberPipe.isInPipe()){
			sum = sum+ numberPipe.takeFromPipe();
		}

		System.out.println(sum);
		System.out.println(numberPipe.takeFromPipe());

	}

	private List<T> values;

	public Pipe(){
		this.values = new ArrayList<>();
	}

	public void putIntoPipe(T value){
		this.values.add(value);
	}

	public T takeFromPipe(){
		if(this.values.size() > 0){
			T oldValue = this.values.get(0);
			this.values.remove(oldValue);
			return oldValue;
		}
		return null;
	}

	public boolean isInPipe(){
		if(this.values.size() > 0){
			return true;
		}
		return false;
	}
}
