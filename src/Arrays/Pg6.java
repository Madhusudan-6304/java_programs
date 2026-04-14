package Arrays;

import java.util.Scanner;

public class Pg6 {

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
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
       System.out.println("The Largest Element:"+min);
	

	}

}
