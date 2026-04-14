package Arrays;

import java.util.Scanner;

public class Pg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    System.out.println("Enter The Array elements:");
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int sum=0;
	    int Prod=1;
	    for(int i=0;i<arr.length;i++) {
	    	sum+=arr[i];
	    	Prod*=arr[i];
	    }
	    System.out.println("The Sum Of elements in array:"+sum);
	    System.out.println("The Product Of elements in array:"+Prod);

	}

}
