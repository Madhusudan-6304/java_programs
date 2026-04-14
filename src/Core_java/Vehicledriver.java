package Core_java;

public class Vehicledriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Bike();
		v.start();
		v.fuel();
		v=new Truck();
		v.start();
		v.fuel();

	}

}
