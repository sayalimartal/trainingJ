//Create savings account and perform various operations like withdraw, deposit, transfer etc.
public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount sayali = new SavingsAccount("Sayali",5000);//Create a savings account with initial balance of Rs.5000
		System.out.println(sayali);
		sayali.withdraw(500);
		sayali.toString();
		int next = SavingsAccount.getNextAccountNumber();
		System.out.println(next);

		SavingsAccount siddhi = new SavingsAccount("Siddhi");//Create a zero-balance account
		System.out.println(siddhi);
		siddhi.deposit(1000);
		siddhi.toString();
		next = SavingsAccount.getNextAccountNumber();
		System.out.println(next);

		String result = sayali.transaction(siddhi, 500);//Transfer amount from one account to the other
		System.out.println(result);
	}
}