package Numbers;

import java.util.Scanner;

public class Pg15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println(num+" is positive");
		else
			System.out.println(num+" is negative");

	}

}
