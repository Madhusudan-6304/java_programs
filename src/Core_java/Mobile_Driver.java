package Core_java;

public class Mobile_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile("vivo");
		System.out.println(m.getBrand());
		Battery b=m.getBattery();
		System.out.println(b.getMah());

	}

}
