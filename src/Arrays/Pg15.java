package Arrays;

import java.util.Scanner;

public class Pg15 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    int largest=Integer.MIN_VALUE;
	    int secondlargest=Integer.MAX_VALUE;
	    System.out.println("Enter The Array elements:");
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]>largest) {
	    		secondlargest=largest;
	    		largest=arr[i];
	    	}
	    	else if(arr[i]>secondlargest && arr[i]!=largest)
	    		secondlargest=arr[i];
	    }
	    
      System.out.println("The Second Largest is:"+secondlargest);
	}


}
