package Numbers;

import java.util.Scanner;

public class Pg23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int square=num*num;
		int sum=0;
		while(square>0) {
			int ld=square%10;
			sum+=ld;
			square/=10;
		}
		if(sum==num)
			System.out.println(num+" is neon number");
		else
			System.out.println(num+" is not a neon number");

	}

}
