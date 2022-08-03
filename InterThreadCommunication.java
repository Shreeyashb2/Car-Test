
public class InterThreadCommunication {
	public static void main(String[] args) {
		
		Cricket play = new Cricket("It's a Wicket"); //eat(), serve()
		
		Batter bt = new Batter(play); // invokes eat()
		Bowler bwl = new Bowler(play); // invokes serve()
		
		
		bwl.start(); //run() - bowl() - sequence???
		bt.start(); //run() - bat() -  sequence???
	}
}
interface Batting
{
	void bat();
}
interface Bowling
{
	void bowl();
}

class Cricket implements Batting, Bowling
{
	String name;
	boolean bowlServed; // default false
	
	Cricket(String item) {
		name = item;
	}
	
	//it is possible that multiple threads can invoke this method
	//so how do we allow only one thread to invoke this method???
	
	public synchronized void bat() { // Eater thread would be calling this
		if(bowlServed==false) {
			System.out.println("bat() : Waiting for the bowler to bowl...");
			try {
				wait(); //waits till being notified / while this thread is awaiting, other thread would 
				//get a chance to run
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//the below line would execute if the wait() is over..
		System.out.println("bat() : Batter tried his best but "+name);
	}
	
	
	public synchronized void bowl() { // Server thread would be calling this
		if(bowlServed==false) {
			System.out.println("bowl() :  Bowler starts bowling....");
			bowlServed=true;
			notify(); //wake up the waiting thread
		}
	}
}

class Batter extends Thread 
{	
	Cricket foodRef;
	
	Batter(Cricket fi) {
		foodRef = fi;
	}
	
	public void run() {
		foodRef.bat();
	}
}
class Bowler extends Thread
{
	 Cricket foodRef;
	
	Bowler(Cricket fi) {
		foodRef = fi;
	}
	public void run() {
		foodRef.bowl();
	}
}

/*

		  Object
		  | wait(), notify()
		  --------------------
		  |					|
		  |  Runnable		|
		  |  |				FoodItem
		  Thread
 	        |       
     	+-----------+  
	    |			|  
	 Eater		   Server


*/