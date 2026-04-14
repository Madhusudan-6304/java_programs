package Core_java;

public class Luxury  extends Mini{
	public void luxuryService() {
		System.out.println("Luxury cabs provide large amount of services");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Luxury l=new Luxury();
		l.service();
		l.miniService();
		l.luxuryService();

	}

}
