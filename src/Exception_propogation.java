
public class Exception_propogation {
	public static void divide() {
		int a=10;
		int b=0;
		int res=a/b;
	
		System.out.println("The result is: "+res);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		divide();
		System.out.println("Main Ends");
		

	}

}
