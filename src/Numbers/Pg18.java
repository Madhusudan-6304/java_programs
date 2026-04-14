package Numbers;

import java.util.Scanner;

public class Pg18 {
	public static void fibnocci(int count) {
		int a=0,b=1;
		System.out.print(a+","+b);
		for(int i=1;i<=count-2;i++) {
		int c=a+b;
		System.out.print(","+c);
		a=b;
		b=c;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int num=sc.nextInt();
		fibnocci(num);
		

	}

}
