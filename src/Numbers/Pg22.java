package Numbers;

import java.util.Scanner;

public class Pg22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		temp=num;
		double sum=0;
		while(temp>0) {
			int ld=temp%10;
			double pow=1;
			for(int i=1;i<=count;i++) {
			 pow=pow*ld;
			}
			sum+=pow;
			temp/=10;
		}
		if(sum==num)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not armstrong number");
	

	}
	}


