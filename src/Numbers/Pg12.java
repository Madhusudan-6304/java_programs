package Numbers;

import java.util.Scanner;

public class Pg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp>0) {
			rev=rev*10+temp%10;
			temp/=10;
		}
    System.out.println("The reverse of "+num+" is:"+rev);
	}

}
