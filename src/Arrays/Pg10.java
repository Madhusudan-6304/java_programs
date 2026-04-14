package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg10 {
	public static void selectionsort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minindex=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			int temp=arr[minindex];
			 arr[minindex]=arr[i];
			 arr[i]=temp;
			    
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    System.out.println("Enter The Array elements:");
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
    System.out.println("Array After Sorting in Increasing Order:");
	selectionsort(arr);
	System.out.println(Arrays.toString(arr));
	}
}
