
class Clock {
	public static void main(String[] args) {
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		

		while(true) {
			System.out.println(hours);
			System.out.println(":");
			System.out.println(minutes);
			System.out.println(":");
			System.out.println(seconds);
			System.out.println("");
			seconds = seconds + 1;
			
			if (seconds > 59){
				minutes = minutes + 1;
				seconds = 0;

				if (minutes > 59) {
					hours = hours + 1;
					minutes = 0;

					if (hours > 59) {
						hours = 0;
					}
				}
			}
		}
	}
}