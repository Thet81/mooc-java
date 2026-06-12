// HashMap.java
package dataStructure;
import dataStructure.Pair;
import dataStructure.List;

public class HashMap<K,V> {
	public static void main(String[] args) {
		HashMap map = new HashMap();
	}
	private List<Pair<K,V>>[] values;
	private int firstFreeIndex;

	public HashMap(){
		this.values = new List[32];
		this.firstFreeIndex = 0;
	}

	public V get(K key){
		int hashValue = Math.abs(key.hashCode() % this.values.length);

		if(this.values[hashValue] == null){
			return null;
		}

		List<Pair<K,V>> valuesAtIndex = this.values[hashValue];

		for(int i =0; i < valuesAtIndex.size(); i++){
			if (valuesAtIndex.value(i).getKey().equals(key)){
				return valuesAtIndex.value(i).getValue();
			}
		}
		return null;
	}

	public void add(K key, V value){
		int hashValue = Math.abs(key.hashCode() % values.length);
			if (values[hashValue] == null) {
				values[hashValue] = new List<>();
			}
		List<Pair<K,V>> valuesAtIndex = values[hashValue];

		int index = -1;
		for(int i = 0; i < valuesAtIndex.size(); i++){
			if (valuesAtIndex.value(i).getKey().equals(key)){
				index = i;
				break;
			}
		}

		if(index < 0) {
			// there is no value related to the key, so create a new one
			valuesAtIndex.add(new Pair<>(key,value));
			this.firstFreeIndex++;
		}else {
			// there is a value related to the provided key, so just update the value
			valuesAtIndex.value(index).setValue(value);
		}
	}
}