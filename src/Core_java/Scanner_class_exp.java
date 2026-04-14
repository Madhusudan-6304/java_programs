package Core_java;

import java.util.Scanner;

public class Scanner_class_exp {

	public static void main(String[] args) {
		// add two numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		int res=a+b;
		System.out.println("Addition::"+res);
		//even numbers in range
		System.out.println("The value of m:");
		int m=sc.nextInt();
		System.out.println("The value of n");
		int n=sc.nextInt();	
		System.out.println("the even numbers in range:");
		for(int i=m;i<=n;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		//prime numbers in range
		System.out.println("the prime numbers in range:");
		for(int num=m;num<=n;num++) {
			if(num<1)
				continue;
			int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num+" ");
		}
		//ASCII numbers in range
		System.out.println("The value of char x:");
		int x=sc.next().charAt(0);
		System.out.println("The value of char y:");
		int y=sc.next().charAt(0);
		System.out.println("the Ascii numbers in range:");
		for(int i=x;i<=y;i++) {
				System.out.println(i);
		}
		
		


	}

}
