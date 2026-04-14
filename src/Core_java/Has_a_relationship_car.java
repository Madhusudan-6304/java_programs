package Core_java;

public class Has_a_relationship_car {

	String brand;
	public String getBrand() {
		return brand;
	}
	public  Has_a_relationship_car(String brand) {
		this.brand=brand;
	}
	private  Has_a_relationship h=new  Has_a_relationship(998);
	public  Has_a_relationship getHas_a_relationship_car() {
		return h;
	}
	
}
