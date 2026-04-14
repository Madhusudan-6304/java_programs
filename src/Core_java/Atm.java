package Core_java;

public abstract class Atm {
	double balance;
	public Atm(double balance) {
		this.balance=balance;
	}
	public abstract void withdraw(double amount);
	public abstract void checkBalance();

}
