package Numbers;

import java.util.Scanner;

public class Pg30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		double sqrt=num/2;
		double temp=0;
		while(temp-sqrt!=0) {
			temp=sqrt;
			sqrt=(temp+num/temp)/2;
		}
		System.out.println("The square root of "+num+" is "+sqrt);

	}

}
