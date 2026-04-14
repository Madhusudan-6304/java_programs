package Core_java;

public class Car {
	private String name;
	public Car(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	private Tyre[] t= {
			           new Tyre("apollo"),
			           new Tyre("ceat"),
			           new Tyre("goodyear")
			           
	};
	public Tyre[] getTyres() {
		return t;
	}


}
