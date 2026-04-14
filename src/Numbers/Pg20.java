package Numbers;

import java.util.Scanner;

public class Pg20 {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0) {
			int lastdigit=temp%10;
			sum+=factorial(lastdigit);
			temp/=10;
		}
		if(sum==num){
			System.out.println(num+" is a peterson number");
		}
		else
			System.out.println(num+" is not a peterson number");

	}

}
