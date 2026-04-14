package Numbers;

import java.util.Scanner;

public class Pg16 {
public static void fact(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("The factorial of "+num+" is "+fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		fact(num);

	}

}
