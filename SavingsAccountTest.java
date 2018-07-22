public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount sayali = new SavingsAccount("Sayali",5000);
		System.out.println(sayali);
		int next = SavingsAccount.getNextAccountNumber();
		System.out.println(next);

		SavingsAccount siddhi = new SavingsAccount("Siddhi");
		System.out.println(siddhi);
		next = SavingsAccount.getNextAccountNumber();
		System.out.println(next);

		String result = sayali.transaction(siddhi, 500);
		System.out.println(result);
	}
}