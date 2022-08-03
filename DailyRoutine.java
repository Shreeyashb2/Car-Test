public class DailyRoutine {
	public static void main(String[] args) {
		System.out.println("Good Morning Shreeyash");
		
		TimeSpend ts = new TimeSpend();
		try {
			ts.alarmClock();
			ts.everydayTask();
		}
		catch (DidntWokeUpInMorning ex) {
			System.out.println(ex);
		}
	}
}

class DidntWokeUpInMorning extends Exception{
	DidntWokeUpInMorning(String msg){
		super(msg);
	}
}
class TimeSpend {
	boolean waking_status;
	
	void alarmClock() {
		if (waking_status == false) {
			waking_status = true;
		}
		System.out.println("Tik Tik TIk Tik Tik Tik Tik");
	}
	void everydayTask() throws DidntWokeUpInMorning{
		if(waking_status = false) {
			DidntWokeUpInMorning NoMorning = new DidntWokeUpInMorning("Sir, you are currently out of time\nYou have to initiate the Engineer's Time Management Mindset and get ready in 10 min");
			throw NoMorning;
		}
		System.out.println("It's 6 AM Let's start the day with Positivity....");
		brush();
		System.out.println("Good Night Shreeyash");
	}
	void brush() {
		System.out.println("Brushing! Brushing! Brushing!");
		gym();
	}
	void gym() {
		System.out.println("Lets do some workout for Fitness...");
		bath();
	}
	void bath() {
		System.out.println("Now let's get ready..Suit Up!!!!!");
		breakfast();
	}
	void breakfast() {
		System.out.println("Breakfast is good enough :) ");
		java();
	}
	void java() {
		System.out.println("Java Training Starts...");
		lunch();
	}
	void lunch() {
		System.out.println("Lunch is Okay Okay could be better :|");
		
		System.out.println("Needs Espresso Immediately.....");
		//java();
	}
	void snacks() {
		System.out.println("Lets eat some snacks");
		refreshment();
	}
	void refreshment() {
		System.out.println("Lets roam around in Pune");
		dinner();
	}
	void dinner() {
		System.out.println("Dinner was good...");
	}
	
}
