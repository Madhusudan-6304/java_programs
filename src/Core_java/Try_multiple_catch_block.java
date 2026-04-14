package Core_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_multiple_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		 Scanner sc=new Scanner (System.in);
		
	     try {
	    	
	 		System.out.println("Enter the number: ");
	 		int a=sc.nextInt();
	 		System.out.println("Enter the Divisor: ");
	 	     int b=sc.nextInt();
	    	 int res=a/b;
	    	 System.out.println("The result is: "+res);
	     }
	     catch(ArithmeticException e) {
	    	 System.out.println("Number cannot be divded by zero");
	     }
	     catch(InputMismatchException e) {
	    	 System.out.println("Number should be Integer Type");
	     }
	     finally {
	    	 sc.close();
	    	 System.out.println("Finally block executed");
	     }

	}

}
