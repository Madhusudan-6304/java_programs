package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg3 {

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
	    int left=0;
	    int right=arr.length-1;
	    while(left<right) {
	    	int temp=arr[left];
	    	arr[left]=arr[right];
	    	arr[right]=temp;
	    	left++;
	    	right--;
	    }
  System.out.println(Arrays.toString(arr));
	}

}
