package Core_java;

public class Constructor_chaining {
	int id;
	String name;
	int age;
	public Constructor_chaining() {
		System.out.println("I am no Argument Constructor");
	}
	public Constructor_chaining(int id) {
		this();
		this.id=id;
	}
	public Constructor_chaining(int id,String name) {
		this(id);
		this.name=name;
	}
	public Constructor_chaining(int id,String name,int age) {
		this(id,name);
		this.age=age;
	}

	

}
