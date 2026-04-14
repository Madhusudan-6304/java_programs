package Core_java;

public class Non_static_method_same_class {
	public void hello()
	{
		System.out.println("I'm non static method hello");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_static_method_same_class n=new Non_static_method_same_class();
		n.hello();
		n.hello();

	}

}
