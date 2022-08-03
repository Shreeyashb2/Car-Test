package snippet;

public class InternetBrowsing {
	public static void main(String[] args) {
		//1. extend from java.lang.Thread class
		//2. override public void run()  method
		//3. create the object of your sub class
		//4. invoke the start() method of it, which would 
		// execute the run() method of it
		
		MyWebsite m1 = new MyWebsite("www.google.com"); //3
		MyWebsite m2 = new MyWebsite("\t\t\t\twww.wikipedia.com"); //3
		MyWebsite m3 = new MyWebsite("\twww.facebook.com"); //3
		MyWebsite m4 = new MyWebsite("\t\t\t\t\t\twww.researchgate.com"); //3

		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		
	}
}

class MyWebsite extends Thread //1
{
	String msg;
	
	MyWebsite(String m) {
		msg = m;
	}
	
	public void run() { //2. overriridng is always optional
		for (int i = 1; i < 100; i++) {
			System.out.println("Pinging "+msg+ " "+i);
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
			|  ...				|		Frame
 			|  run();			|		|
 			| }					|		| isA
 			| run() { }			|		|
 	--------------				MyMessageFrame
 	|							| run() {
 	MyMessage					|  ...
 								| }
 */ 
