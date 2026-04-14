package Core_java;

public class SbiAtm extends Atm {
	public SbiAtm(double balance) {
		super(balance);
	}
	@Override
	public void withdraw(double amount)
	{
		if(balance>=amount)
			balance=balance-amount;
		else
			System.out.println("Insufficent balance");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("The balance is:"+balance);
	}
}
