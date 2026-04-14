package Arrays;

import java.util.Scanner;

public class Pg7 {
	public static void linearsearch(int arr[],int element) {
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				pos=i;
				break;
			}
		}
		if(pos!=-1)
			System.out.println(element+" is found at index:"+pos);
		else
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
	    System.out.println("Enter the target Element:");
	    int target=sc.nextInt();
	    linearsearch(arr,target);

	}

}
