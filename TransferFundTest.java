public class TransferFundTest{
	public static void main(String[] args) {
		
		Savings1 svAcc = new Savings1();
		svAcc.print();
		
		Current1 crAcc = new Current1();
		crAcc.print();
		
		
		System.out.println("========================");
		TransferringFundService.transfer(crAcc, svAcc, 50000);
		svAcc.print();
		crAcc.print();
		System.out.println("========================");
		
		
	}
}
class TransferringFundService{
	public static void transfer(Withdrawing1 wd, Savings1 sv, float transferAmt) {
		System.out.println("Fund Transfer Initiated..........");
		wd.withdraw(transferAmt);
		sv.deposit(transferAmt);
		System.out.println("Fund Transferred Successfully");
		
	}
}


interface Withdrawing1{
	public void withdraw(float amt);
}

interface Depositing1{
	public void deposit(float amt);
}

class Savings1 implements Withdrawing1, Depositing1{
	float balance = 900000;
	
	public void withdraw(float amt) {
		System.out.println("Savings: Withdrawing.....");
		balance = balance - amt;
	}
	public void deposit(float amt) {
		System.out.println("Savings: Depositing...");
		balance = balance+amt;
	}
	public void print() {
		System.out.println("Printing the Savings Account...\n");
		System.out.println("Savings Account Balance is "+balance);
	}
	
	
}
class Current1 implements Withdrawing1, Depositing1{
	float balance = 900000;
	
	public void withdraw(float amt) {
		System.out.println("Current: Withdrawing.....");
		balance = balance - amt;
	}
	public void deposit(float amt) {
		System.out.println("Current: Depositing...");
		balance = balance+amt;
	}
	public void print() {
		System.out.println("Printing the Current Account...\n");
		System.out.println("Current Account Balance is "+balance);
	}	
}