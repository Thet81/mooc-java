// IOU.java
import java.util.*;

class IOU {

	HashMap<String,Double> list;

	public IOU(){
		this.list = new HashMap<>();
	}

	public void setSum (String toWhom, double amount){
		if(!this.list.containsKey(toWhom)){
			this.list.put(toWhom,amount);
			return;
		}
		// if towhom has already existed
		double amounts = this.list.get(toWhom);
		amounts += amount;
		this.list.put(toWhom,amounts);
	}

	public double howMuchDoIOweTo(String toWhom){
		if(this.list.containsKey(toWhom)){
			return this.list.get(toWhom);
		}
		return 0;
	}
}