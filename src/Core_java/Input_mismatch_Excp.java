package Core_java;

import java.util.Scanner;

public class Input_mismatch_Excp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Main starts");
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Enter the Divisor:");
		int b=sc.nextInt();
		int res=a/b;
		System.out.println("The result is :"+res);
		System.out.println("Main Ends");
		
		

	}

}
