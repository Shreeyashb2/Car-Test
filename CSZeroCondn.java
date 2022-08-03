import java.time.LocalDate;

public class CSZeroCondn {
	public static void main(String[] args) 
	{
		
		GameTreasury gt = new GameTreasury(101,"Shreeyash",75000);
		
		GameTreasury.Info gameInfo1 = new GameTreasury.Info();
		GameTreasury.Info gameInfo2 = new GameTreasury.Info();
		GameTreasury.Info gameInfo3 = new GameTreasury.Info();
		GameTreasury.Info gameInfo4 = new GameTreasury.Info();
		
		gt.activateWithdrawl(true);
	
		double amtInsert1=500;
		gt.withdraw(amtInsert1);
		gameInfo1.setSerialId(1);
		gameInfo1.setTransactionAmount(amtInsert1);
		gameInfo1.setTransactionDate(LocalDate.now());
		gameInfo1.setTransactionType("Debit");
		gameInfo1.setRemaniningBalance(gt.getBalance() - amtInsert1);
		
		double amtInsert2=500;
		gt.withdraw(amtInsert2);
		gameInfo2.setSerialId(1);
		gameInfo2.setTransactionAmount(amtInsert2);
		gameInfo2.setTransactionDate(LocalDate.now());
		gameInfo2.setTransactionType("Debit");
		gameInfo2.setRemaniningBalance(gt.getBalance() - amtInsert2);
			
		double amtInsert3=700;
		gt.withdraw(amtInsert3);
		gameInfo3.setSerialId(3);
		gameInfo3.setTransactionAmount(amtInsert3);
		gameInfo3.setTransactionDate(LocalDate.now());
		gameInfo3.setTransactionType("Debit");
		gameInfo3.setRemaniningBalance(gt.getBalance() - amtInsert3);
		
		double amtInsert4=800;
		gt.withdraw(amtInsert4);
		gameInfo4.setSerialId(4);
		gameInfo4.setTransactionAmount(amtInsert4);
		gameInfo4.setTransactionDate(LocalDate.now());
		gameInfo4.setTransactionType("Debit");
		gameInfo4.setRemaniningBalance(gt.getBalance() - amtInsert4);
		
		System.out.println(gameInfo1);
		System.out.println(gameInfo2);
		System.out.println(gameInfo3);
		System.out.println(gameInfo4);
		
		gt.deActivateWithdrawl(false);
		gt.withdraw(6000);
	}
		
}
class GameTreasury
{
	private int playerID;
	private String playerName;
	private double balance;
	private CoinPermission coinPerm = new CoinPermission(false,true,true);
	
	public GameTreasury(int playerID, String playerName, double balance) 
	{
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.balance = balance;
	}	
	public void deActivateWithdrawl(boolean deactivate) 
	{
		System.out.println("Process Completed...\nPlease wait for few min for coins to get reflected in your account...");
		coinPerm.setWithdraw(deactivate);		
	}
	public void activateWithdrawl(boolean activate) 
	{
		System.out.println("Initiating the process...\nPlease Wait...");
		coinPerm.setWithdraw(activate);
	}
	public int getPlayerID() 
	{
		return playerID;
	}
	public void setPlayerID(int playerID) 
	{
		this.playerID = playerID;
	}
	public String getPlayerName() 
	{
		return playerName;
	}
	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	void withdraw(double amt) {
		if(coinPerm.isWithdraw()==false) 
		{
			throw new RuntimeException("Withdraw is not yet allowed...\nPlease try after some time...");
		}
		else 
		{
			balance = balance - amt;
			System.out.println("Process successfull Please wait for coins to get reflected in your account...");
		}
	}
	public static class Info // can be referred via GameTreasury.Info
	{
		int serialId;
		LocalDate transactionDate;
		String transactionType;
		double transactionAmount;
		double remaniningBalance;
		public int getSerialId() 
		{
			return serialId;
		}
		public void setSerialId(int serialId) 
		{
			this.serialId = serialId;
		}
		public LocalDate getTransactionDate() 
		{
			return transactionDate;
		}
		public void setTransactionDate(LocalDate transactionDate) 
		{
			this.transactionDate = transactionDate;
		}
		public String getTransactionType() 
		{
			return transactionType;
		}
		public void setTransactionType(String transactionType) 
		{
			this.transactionType = transactionType;
		}
		public double getTransactionAmount() 
		{
			return transactionAmount;
		}
		public void setTransactionAmount(double transactionAmount) 
		{
			this.transactionAmount = transactionAmount;
		}
		public double getRemaniningBalance() 
		{
			return remaniningBalance;
		}
		public void setRemaniningBalance(double remaniningBalance) 
		{
			this.remaniningBalance = remaniningBalance;
		}
		@Override
		public String toString() {
			return "Info [serialId=" + serialId + ", transactionDate=" + transactionDate + ", transactionType="
					+ transactionType + ", transactionAmount=" + transactionAmount + ", remaniningBalance="
					+ remaniningBalance + "]";
		}		
	}
	
	private class CoinPermission //private nested class
	{
		boolean withdraw; //false
		boolean deposit ;// false;
		boolean transfer; //false
		public CoinPermission(boolean withdraw, boolean deposit, boolean transfer) 
		{
			super();
			this.withdraw = withdraw;
			this.deposit = deposit;
			this.transfer = transfer;
		}
		public boolean isWithdraw() 
		{
			return withdraw;
		}
		public void setWithdraw(boolean withdraw) 
		{
			this.withdraw = withdraw;
		}
		public boolean isDeposit() 
		{
			return deposit;
		}
		public void setDeposit(boolean deposit) 
		{
			this.deposit = deposit;
		}
		public boolean isTransfer() 
		{
			return transfer;
		}
		public void setTransfer(boolean transfer) 
		{
			this.transfer = transfer;
		}		
	}
}
