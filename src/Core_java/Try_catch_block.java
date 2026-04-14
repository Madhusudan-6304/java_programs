package Core_java;

public class Try_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     int b=0;
     try {
    	 int res=a/b;
    	 System.out.println("The result is: "+res);
     }
     catch(ArithmeticException e) {
    	 System.out.println("Number cannot be diveded by zero");
     }
	}

}
