package Arrays;

import java.util.Scanner;

public class Pg12 {
	public static void binarySearch(int arr[],int element) {
		boolean found=false;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==element) {
				System.out.println("The "+element+" is found at index:"+mid);
				found=true;
			    break;	
			}
			    
			else if(arr[mid]<element)
				low=mid+1;
			else 
				high=mid-1;	
			}
		if(!found)
			System.out.println(element+" is not found");
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
	    System.out.println("Enter the Target element");
	    int element=sc.nextInt();
	    binarySearch(arr,element);
	    sc.close();

	}

}
