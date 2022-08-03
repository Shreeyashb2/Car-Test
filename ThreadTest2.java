import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadTest2 {
	public static void main(String[] args) {
		
		BikeFrame bf1 = new BikeFrame("BikeFrame1",200,100,150,100);
		BikeFrame bf2 = new BikeFrame("BikeFrame2",200,100,350,100);
		BikeFrame bf3 = new BikeFrame("BikeFrame3",200,100,550,100);
		
		bf1.setVisible(true);
		bf2.setVisible(true);
		bf3.setVisible(true);
		
		Thread t1 = new Thread(bf1); //bf1 is of type Runnable
						//which has the method to be called
		
		Thread t2 = new Thread(bf2);
		Thread t3 = new Thread(bf3);
		
		t1.start(); //t1's start() -> would invoke bf1's run()
		t2.start();
		t3.start();
		
		
	}
}

//is BikeFrame a Runnable ?

class BikeFrame extends JFrame implements Runnable
{
	JTextField t = new JTextField(20);
	
	BikeFrame(String title, int h, int w, int x, int y) {
		setSize(h,w); //super class method of JFrame
		setLocation(x,y);
		setTitle(title);
		add(t);
		
	}
	public void run() { //it is a mandate of Runnable
		for (int i = 0; i <100000; i++) {
			t.setText(i+"");
		}
	}
}



/*
	Bank Cash Deposit Counter

A/c Book  
101  Dinesh 55000
102  Ramesh 60000
103  Naresh 70000
104  Rajesh 80000
..
..

	Teller1				Teller2			Teller3
	 |					|				|
1 		getBalance			getBalance		getBalance
	|					|				|
2 		calcAmt				calcAmt			calcAmt
	|					|				|
3 		setBalance			setBalance		setBalance
	|					|				|
who?	Customer1 / 3mnts	Customer2		Customer3
a/c	101					102				103
cash?	5000				7000			8000
deno?	100/-				500/-			2000/-
time	10.30am 			10.30am			10.30am
notes? 50					14				4

	Customer5
	
	
					Eatable [i] <- interface
					|eat();
			--------------------+
			|				    |isA
		FoodItem [c]			|	
		| serve() {			   	|	Stone [c]
		|   ...				   	|	|
		|   eat();			   	|	|
		| }					   	|	|isA
		| eat() { }				|	|
	-----------					Chalk [c]
	|							|
Pizza	[c]						eat() { } mandate
	
	
					Runnable
					| run();
		--------------------+
		|					|
		Thread				|isA
		| start() {			|
	|  ...				|		JFrame
		|  run();			|		|
		| }					|		| isA
		| run() { }			|		|
--------------				BikeFrame
|							| run() {
MyMessage					|  ...
Bike						|
Train						|
							| }
							
	Thread
	  - Thread(Runnable r)
	  - Thread(String s)
	  - Thread()
	  
*/ 

