// List.java

public class List<Type> {

	public static void main(String[] args) {
		List<String> myList = new List<>();
		
		// for(int i = 0; i < 11; i++){
		// 	myList.add("hello");
		// }
		System.out.println(myList.contains("hello"));
		myList.add("hello");
		System.out.println(myList.contains("hello"));
	}
	private Type[] values;
	private int firstFreeIndex;

	public List(){
		this.values = (Type[])new Object[10];
		this.firstFreeIndex = 0;
	}

	public void add(Type value){
		if(this.firstFreeIndex == this.values.length){
			grow();
		}
		this.values[this.firstFreeIndex] = value;
		this.firstFreeIndex ++;
	}

	private void grow(){
		int newSize = this.values.length + this.values.length / 2;

		Type[] newValues = (Type[]) new Object[newSize];

		for(int i = 0; i < this.values.length; i++){
			newValues[i] = this.values[i];
		}

		this.values = newValues;
	}

	public boolean contains(Type value){
		for(int i = 0; i < this.firstFreeIndex; i++){
			if(this.values[i].equals(value)){
				return true;
			}
		}
		return false;
	}

	public void remove(Type value){
		// for(int i = 0; i < this.firstFreeIndex; i++){
		// 	if (value == this.values[i] || this.values[i].equals(value)){
		// 		this.values[i] = null;
		// 		this.firstFreeIndex--;
		// 		return;
		// 	}
		// }
		int indexOfValue = indexOfValue(value);
		if(indexOfValue < 0){
			return;
		}
		moveToTheLeft(indexOfValue);
		this.firstFreeIndex--;
	}

	private int indexOfValue(Type value){
		for(int i= 0; i < this.firstFreeIndex; i++){
			if (this.values[i].equals(value)){
				return i;
			}
		}

		return -1;
	}

	private void moveToTheLeft(int fromIndex){
		for(int i = fromIndex; i < this.firstFreeIndex; i++){
			this.values[i] = this.values[i+1];
		}
	}
}