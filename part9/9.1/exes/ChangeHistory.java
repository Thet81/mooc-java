// ChangeHistory.java
import java.util.*;

public class ChangeHistory {

	private ArrayList<Double> history;

	public ChangeHistory(){
		this.history = new ArrayList<>();
	}

	public void add(double status){
		this.history.add(status);
	}

	public void clear(){
		this.history.clear();
	}

	public double maxValue () {

		if (this.history.size() == 0) {
			return 0;
		}
		double maxVal = this.history.get(0);

		for (double value : this.history){
			if(value > maxVal){
				maxVal = value;
			}
		}
		return maxVal;
	}

	public double minValue () {
		if (this.history.size() == 0) {
			return 0;
		}

		double minVal = this.history.get(0);

		for(double value : this.history){
			if (value < minVal){
				minVal = value;
			}
		}

		return minVal;
	}

	public double average (){
		if (this.history.size() == 0) {
			return 0;
		}

		double sum = 0;
		for(double value : this.history){
			sum += value;
		}

		return sum / this.history.size();
	}

	@Override
	public String toString(){
		return this.history.toString();
	}
}