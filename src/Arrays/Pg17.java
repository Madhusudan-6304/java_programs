package Arrays;

import java.util.Scanner;

public class Pg17 {

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
	    System.out.println("The Duplicate elements are:");
	    for(int i=0;i<arr.length;i++) {
	    	boolean isduplicate=false;
	    	for(int j=i+1;j<arr.length;j++) {
	    		
	    		if(arr[i]==arr[j]) {
	    			isduplicate=true;
	    			break;
	    		}
	    	}
	    	
	    	if(isduplicate)
	    		System.out.println(arr[i]);
	    }
	    
	    
	   

	}

}
