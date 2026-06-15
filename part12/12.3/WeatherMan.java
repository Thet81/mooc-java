// WeatherMan.java
import java.util.*;

public class WeatherMan{
	public static void main(String[] args) {
		WeatherMan forecaster = new WeatherMan();

		ArrayList<String> days = new ArrayList<>();
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		days.add("Thu");
		days.add("Fri");
		days.add("Sat");
		days.add("Sun");

		System.out.println("Next week's weather forecast");

		for(String day : days){
			String weatherForecast = forecaster.forecast();
			int temperaturForcast = forecaster.makeAForecast();
			System.out.println(day + ":" + weatherForecast + temperaturForcast);
		}

	}
	private Random random;

	public WeatherMan(){
		this.random = new Random();
	}

	public String forecast(){
		double probability = this.random.nextDouble();

		if(probability <= 0.1){
			return "It rains";
		}else if (probability <= 0.4){
			return "It snows";
		}else {
			return "The sun shines";
		}
	}

	public int makeAForecast(){
		return (int) (4 * this.random.nextGaussian()- 3);
	}
}