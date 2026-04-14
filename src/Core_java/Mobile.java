package Core_java;

public class Mobile {
	private String brand;
	public Mobile(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	private Battery b=new Battery(5500);
	public Battery getBattery() {
		return b;
	}

	
}
