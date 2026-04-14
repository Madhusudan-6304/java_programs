package Numbers;

import java.util.Scanner;

public class Pg17 {
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return num*fact(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("The factorial of "+num+" is  "+fact(num));
		

	}

}
