package Core_java;

public class Atm_driver {
	public static void main(String[] args) {
	Atm a=new SbiAtm(1000);
	a.withdraw(1100);
	a.checkBalance();
	}

}
