package Numbers;

import java.util.Scanner;

public class Pg29 {
	public static int count(int num) {
		int temp=num;
		int digits=0;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		return digits;
	}
	public static void fascinating_no(int num) {
		boolean flag=true;
		int num2=num*2;
		int num3=num*3;
		String s=""+num+num2+num3;
		char[] x=s.toCharArray();
		for(char ch='1';ch<='9';ch++) {
			int count=0;
			for(int i=0;i<x.length;i++) {
				if(x[i]==ch)
					count++;
					
			}
			if(count>1) {
				flag=false;
				break;
			}
		}
		if(flag)
		    System.out.println(num+" is  fascinating number");
		else
			System.out.println(num+" is  not fascinating number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(count(num)>=3)
			fascinating_no(num);
		else
			System.out.println(num+" is not fascinating number");
		
		

	}

}
