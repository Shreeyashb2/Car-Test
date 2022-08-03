import javax.swing.JFrame;
import javax.swing.JTextField;

public class TransactionID {
	public static void main(String[] args) {
		
		BikeFrame bf1 = new BikeFrame("HDFC Bank",200,100,150,100);
		BikeFrame bf2 = new BikeFrame("SBI Bank",200,100,450,100);
		BikeFrame bf3 = new BikeFrame("Kotak Mahindra Bank",200,100,650,100);
		
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

class OnlineTransaction extends JFrame implements Runnable
{
	JTextField t = new JTextField(20);
	
	OnlineTransaction(String title, int h, int w, int x, int y) {
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