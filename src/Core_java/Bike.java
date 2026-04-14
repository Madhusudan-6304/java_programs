package Core_java;

public class Bike  extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike is started");
	}
	@Override
	public void fuel() {
		System.out.println("Fuel is petrol");
	}

}
