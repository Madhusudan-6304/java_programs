package Numbers;

import java.util.Scanner;

public class Pg19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		boolean flag=true;
		int square=num*num;
		while(temp>0) {
			if(square%10!=temp%10) {
				flag=false;
				break;
			}
			square/=10;
			temp/=10;
	
		}
		if(flag)
			System.out.println("atomorphic number");
		else
			System.out.println("Not atomorphic number");
	}

}
