package Core_java;

public class Truck  extends Vehicle{
	@Override
	public void start() {
		System.out.println("Truck is started");
	}
	@Override
	public void fuel() {
		System.out.println("Fuel is petrol and diesel");
	}


}
