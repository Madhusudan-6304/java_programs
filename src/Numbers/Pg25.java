package Numbers;

import java.util.Scanner;

public class Pg25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number:");
				int num=sc.nextInt();
				int sum=0;
				int prod=1;
				int temp=num;
				while(temp>0){
					int ld=temp%10;
					sum+=ld;
					prod*=ld;
					temp/=10;
				}
				if(sum==prod) 
					System.out.println(num+" is spy number");
				else
					System.out.println(num+" is not a spy number");
	}

}
