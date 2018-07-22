public class SavingsAccount {
	private int accountNumber = 0;
	private String name;
	private double balance;
	private static int lastAccountNumber = 0;
	  
	public SavingsAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	public SavingsAccount(String name) {
		this.name = name;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		if(this.balance > amount && amount>0)
			this.balance -= amount;
	}
	public void deposit(double amount) {
		if(amount > 0)
			this.balance +=amount;
	}
	public static int getNextAccountNumber() {
		return lastAccountNumber + 1;
	}
	public String transaction(SavingsAccount receiver, double amount){
		String result = new String();
		if(PaymentGateway.transfer(this, receiver, amount)) 
			return "Payment Successful";
		else 
			return "Payment Failed";
	}
	@Override
	public String toString() {
		return "SavingsAccount [account number = " +accountNumber+ " name = " + name + ", balance = " + balance + "]";
	}	
}