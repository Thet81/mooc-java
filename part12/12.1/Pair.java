// Pair.java

public class Pair<T,K> {
	public static void main(String[] args) {
		Pair<String,Integer> i1 = new Pair<>("Pow",3);
		Pair<Object,Object> i2 = new Pair<>("Hey",i1);
		System.out.println(i1);
		System.out.println(i2);
	}
	private T first;
	private K second;

	public Pair(T first, K second){
		this.first = first;
		this.second = second;
	}
	public void setValue(T first, K second){
		this.first = first;
		this.second = second;
	}

	public T getFirst (){
		return this.first;
	}

	public K getSecond(){
		return this.second;
	}

	public String toString(){
		return this.first.toString() + ""+ this.second.toString();
	}
}