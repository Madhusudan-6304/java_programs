package Numbers;

import java.util.Scanner;

public class Pg14 {
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
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(isprime(num))
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		

	}

}
