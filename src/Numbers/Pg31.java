package Numbers;

import java.util.Scanner;

public class Pg31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		double cbrt=num/2;
		double temp=0;
		while(temp-cbrt!=0) {
			temp=cbrt;
			cbrt=((2*temp)+num/(temp*temp))/3;
		}
		System.out.println("The square root of "+num+" is "+cbrt);

	}


	}


