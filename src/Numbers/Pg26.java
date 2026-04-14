package Numbers;

import java.util.Scanner;

public class Pg26 {
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static boolean isprime(int num) {
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
        if(isprime(num)&&isprime(reverse(num)))
        	System.out.println(num+" is emirp number");
        else
        	System.out.println(num+" is not a emirp number");
	}

}
