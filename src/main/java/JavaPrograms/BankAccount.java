package JavaPrograms;

public class BankAccount {

	protected double Balance =1000;
	protected double Amount;
	
	public void Deposit(double Amount)
	{
		Balance = Balance + Amount;
		System.out.println("After depositing " + Amount + "Balance is " + Balance);
	}
	
	public void Withdraw(double Amount)
	{
		Balance = Balance - Amount;
		System.out.println("After withdrawing " + Amount + "Balance is " + Balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount RevathyAcc = new BankAccount();
		BankAccount ManojAcc;
		RevathyAcc.Deposit(200);
		

	}

}
