package Core_java;

public class Method_overloading {
	public static void add() {
		System.out.println("I'm add method");
	}
	public static void add(int a,int b) {
		System.out.println("I'm add method of two args:"+(a+b));
	}
	public static void add(double a,double b) {
		System.out.println("I'm add method of double type with two args:"+(a+b));
		
	}
	public static void add(int a,int b,int c) {
		System.out.println("I'm add method of three args:"+(a+b+c));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           add();
           add(10,290);
           add(45.75,90.25);
           add(10,20,40);

	}

}
