// ClockDemo.java

class ClockDemo {
	private ClockHand hours;
	private ClockHand seconds;
	private ClockHand minutes;

	public static void main(String[] args) {
		ClockDemo clock = new ClockDemo();

		while(true) {
			System.out.println(clock);
			clock.advance();
		}
	}
	public ClockDemo(){
		this.hours = new ClockHand(24);
		this.minutes = new ClockHand(60);
		this.seconds = new ClockHand(60);
	}

	public void advance () {
		this.seconds.advance();

		if (this.seconds.value() == 0) {
			this.minutes.advance();
			if(this.minutes.value() == 0){
				this.hours.advance();
			}
		}
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
}