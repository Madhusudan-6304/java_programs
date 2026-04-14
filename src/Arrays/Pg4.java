package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg4 {

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
	    for(int i=0;i<arr.length/2;i++) {
	    	arr[i]=arr[i]+arr[arr.length-i-1];
	    	arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
	    	arr[i]=arr[i]-arr[arr.length-i-1];
	    	
	    }
   
	    System.out.println(Arrays.toString(arr));
	}

}
