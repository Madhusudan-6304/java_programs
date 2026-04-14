package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg21 {
	public static void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
		    while(j>=0 && arr[j]>key) {
		    	arr[j+1]=arr[j];
		    	j--;
		    	 
		    }
		  arr[j+1]=key;
		   
		}
	}

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
	    insertionsort(arr);
	    System.out.println("Sorting in Ascending Order:");
	    System.out.println(Arrays.toString(arr));
		

	}

}
