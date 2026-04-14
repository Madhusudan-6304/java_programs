package Numbers;

import java.util.Scanner;

public class Pg27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
        if(year%4==0)
        	System.out.println("leap year");
        else if(year%400==0 && year%100!=0)
        	System.out.println("leap year");
        else
        	System.out.println("not leap year");
	}

}
