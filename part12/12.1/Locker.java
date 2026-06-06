// Locker.java

public class Locker<T> {
	private T element;

	public void setValue(T element){
		this.element = element;
	}

	public T getValue(){
		return this.element;
	}
}