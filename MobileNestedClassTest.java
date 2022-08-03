/*import java.time.LocalDate;

public class MobileNestedClassTest {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone("Shreeyash",1216,"Airtel");
		MobilePhone.MobileDetails md1 = new MobilePhone.MobileDetails();
		MobilePhone.MobileDetails md2 = new MobilePhone.MobileDetails();
		MobilePhone.MobileDetails md3 = new MobilePhone.MobileDetails();
		MobilePhone.MobileDetails md4 = new MobilePhone.MobileDetails();
		
		mp.initiate(true);
		
		
		
	}
}

class MobilePhone{
	private String ownerName;
	private int EmployeeNumber;
	private String simOperator;
	private MobileInnerDetails mid = new MobileInnerDetails(154729348593157,"4.14.190-per-jfy-1.4597.6.1579246.3",6.8);
	
	
	
	
	public MobilePhone(String ownerName, int employeeNumber, String simOperator) {
		super();
		this.ownerName = ownerName;
		EmployeeNumber = employeeNumber;
		this.simOperator = simOperator;
		
	}

	 
	 
	 
	

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public String getSimOperator() {
		return simOperator;
	}

	public void setSimOperator(String simOperator) {
		this.simOperator = simOperator;
	}
	
	void initiate(boolean initiate)
	{
		System.out.println("Initiating the process....");
		.setWithdraw(activate);





	private class MobileDetails{
		LocalDate buyTime;
		double mobilePrice;
		int cashPayment;
		String brandName;
		String modelName;
		
		public MobileDetails(LocalDate buyTime, double mobilePrice, int cashPayment, String brandName,
				String modelName) {
			super();
			this.buyTime = buyTime;
			this.mobilePrice = mobilePrice;
			this.cashPayment = cashPayment;
			this.brandName = brandName;
			this.modelName = modelName;
		}
	
		public LocalDate getBuyTime() {
			return buyTime;
		}
		public void setBuyTime(LocalDate buyTime) {
			this.buyTime = buyTime;
		}
		public double getMobilePrice() {
			return mobilePrice;
		}
		public void setMobilePrice(double mobilePrice) {
			this.mobilePrice = mobilePrice;
		}
		public int getCashPayment() {
			return cashPayment;
		}
		public void setCashPayment(int cashPayment) {
			this.cashPayment = cashPayment;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		@Override
		public String toString() {
			return "MobileDetails [buyTime=" + buyTime + ", mobilePrice=" + mobilePrice + ", cashPayment=" + cashPayment
					+ ", brandName=" + brandName + ", modelName=" + modelName + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		private class MobileInnerDetails
		{
			private int IMEI;
			private String kernelVersion;
			private int sarRating;
		}


}*/


import java.time.LocalDate;
import java.util.Random;


public class MobileNestedClassTest{
	public static void main(String[] args) {
		/*
		BankAccount acc = new BankAccount(101,"Jack",50000);
		
		BankAccount.Statement bankStatement1 = new BankAccount.Statement();
		BankAccount.Statement bankStatement2 = new BankAccount.Statement();
		BankAccount.Statement bankStatement3 = new BankAccount.Statement();
		BankAccount.Statement bankStatement4 = new BankAccount.Statement();
		
		acc.activateWithdrawl(true);
		
		double transAmt1=500;
		acc.withdraw(transAmt1);
		bankStatement1.setSerialId(1);
		bankStatement1.setTransactionAmount(transAmt1);
		bankStatement1.setTransactionDate(LocalDate.now());
		bankStatement1.setTransactionType("Debit");
		bankStatement1.setRemaniningBalance(acc.getBalance() - transAmt1);
		
		
		double transAmt2=500;
		acc.withdraw(transAmt2);
		bankStatement2.setSerialId(1);
		bankStatement2.setTransactionAmount(transAmt2);
		bankStatement2.setTransactionDate(LocalDate.now());
		bankStatement2.setTransactionType("Debit");
		bankStatement2.setRemaniningBalance(acc.getBalance() - transAmt2);
		
			
		double transAmt3=700;
		acc.withdraw(transAmt3);
		bankStatement3.setSerialId(3);
		bankStatement3.setTransactionAmount(transAmt3);
		bankStatement3.setTransactionDate(LocalDate.now());
		bankStatement3.setTransactionType("Debit");
		bankStatement3.setRemaniningBalance(acc.getBalance() - transAmt3);
		
		double transAmt4=800;
		acc.withdraw(transAmt4);
		bankStatement4.setSerialId(4);
		bankStatement4.setTransactionAmount(transAmt4);
		bankStatement4.setTransactionDate(LocalDate.now());
		bankStatement4.setTransactionType("Debit");
		bankStatement4.setRemaniningBalance(acc.getBalance() - transAmt4);
		
		
		System.out.println(bankStatement1);
		System.out.println(bankStatement2);
		System.out.println(bankStatement3);
		System.out.println(bankStatement4);
		
		acc.deActivateWithdrawl(false);
		
		acc.withdraw(6000);
		
		*/

		
		MobilePhone mp = new MobilePhone();
		
		MobilePhone.lists lst1 = new MobilePhone.lists();
		MobilePhone.lists lst2 = new MobilePhone.lists();
		MobilePhone.lists lst3 = new MobilePhone.lists();
		MobilePhone.lists lst4 = new MobilePhone.lists();
		
		double transAmt = 500;
		lst1.setBrandName("Redmi");
		lst1.setBuyTime(LocalDate.now());
		lst1.setCashPayment(20000);
		lst1.setModelName("Note 10 Pro");
		lst1.setMobilePrice(14999);
		
		double transAmt = 500;
		lst1.setBrandName("Redmi");
		lst1.setBuyTime(LocalDate.now());
		lst1.setCashPayment(20000);
		lst1.setModelName("Note 10 Pro");
		lst1.setMobilePrice(14999);
		
		double transAmt = 500;
		lst1.setBrandName("Redmi");
		lst1.setBuyTime(LocalDate.now());
		lst1.setCashPayment(20000);
		lst1.setModelName("Note 10 Pro");
		lst1.setMobilePrice(14999);
		
		double transAmt = 500;
		lst1.setBrandName("Redmi");
		lst1.setBuyTime(LocalDate.now());
		lst1.setCashPayment(20000);
		lst1.setModelName("Note 10 Pro");
		lst1.setMobilePrice(14999);
		
		
		 
		
	}
}

class MobilePhone
{
	private String ownerName;
	private int EmployeeNumber;
	private String simOperator;
	
	Random randomGenerator=new Random();
	//private MobilePhone.lists.MobileInnerDetails mid = new MobilePhone.lists.MobileInnerDetails((randomGenerator.nextInt(1893357) + 1),"4.14.190-per-jfy-1.4597.6.1579246.3",6.8);
	
	
	
	
	
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public String getSimOperator() {
		return simOperator;
	}

	public void setSimOperator(String simOperator) {
		this.simOperator = simOperator;
	}

	
	public static class lists // can be referred via BankAccount.Statement
	{
		
		
			LocalDate buyTime;
			double mobilePrice;
			int cashPayment;
			String brandName;
			String modelName;
			private int imei;
			private String kernelVersion;
			private int sarRating;
			
			public lists() {
				super();
				this.buyTime = buyTime;
				this.mobilePrice = mobilePrice;
				this.cashPayment = cashPayment;
				this.brandName = brandName;
				this.modelName = modelName;
			}
		
			public LocalDate getBuyTime() {
				return buyTime;
			}
			public void setBuyTime(LocalDate buyTime) {
				this.buyTime = buyTime;
			}
			public double getMobilePrice() {
				return mobilePrice;
			}
			public void setMobilePrice(double mobilePrice) {
				this.mobilePrice = mobilePrice;
			}
			public int getCashPayment() {
				return cashPayment;
			}
			public void setCashPayment(int cashPayment) {
				this.cashPayment = cashPayment;
			}
			public String getBrandName() {
				return brandName;
			}
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			public String getModelName() {
				return modelName;
			}
			public void setModelName(String modelName) {
				this.modelName = modelName;
			}
			@Override
			public String toString() {
				return "MobileDetails [buyTime=" + buyTime + ", mobilePrice=" + mobilePrice + ", cashPayment=" + cashPayment
						+ ", brandName=" + brandName + ", modelName=" + modelName + "]";
			}
		
	
	
	private class MobileInnerDetails //private nested class
	{
		long imei; //false
		String kernelVersion ;// false;
		double sarRating; //false
		
		
		


		public MobileInnerDetails(long imei, String kernelVersion, double d) {
			super();
			this.imei = imei;
			this.kernelVersion = kernelVersion;
			this.sarRating = d;
		}
	}






		public void setImei(int imei) {
			this.imei = imei;
		}




		public void setKernelVersion(String kernelVersion) {
			this.kernelVersion = kernelVersion;
		}








		public void setSarRating(int sarRating) {
			this.sarRating = sarRating;
		}



		
	}
}





















