package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg13 {
	public static void leftrotate(int arr[],int count ) {
	
		for(int i=0;i<count;i++) {
			int temp=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=temp;
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
	    System.out.println("Enter The Count");
	    int count=sc.nextInt();
	    leftrotate(arr,count);
	    System.out.println("Array after rotating "+count+" times:");
	    System.out.println(Arrays.toString(arr));
	}

}
