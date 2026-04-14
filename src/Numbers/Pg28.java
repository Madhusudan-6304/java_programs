package Numbers;

import java.util.Scanner;

public class Pg28 {
public static int count(int num) {
	int temp=num;
	int digits=0;
	while(temp>0) {
		digits++;
		temp/=10;
	}
	return digits;
}
public static void istech(int num) {
	int   divisor=1;
	for(int i=0;i<count(num)/2;i++) {
		divisor*=10;
		
	}
	int firstpart=num/divisor;
	int secondpart=num%divisor;
	int square=(firstpart+secondpart)*(firstpart+secondpart);
	if(square==num)
		System.out.println(num+" is a tech number");
	else
		System.out.println(num+" is not a tech number");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(count(num)%2==0)
			istech(num);
		else
			System.out.println(num+" is not a tech number");
		
		

	}

}
