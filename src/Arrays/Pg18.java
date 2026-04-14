package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pg18 {

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
	    Set<Integer> s=new HashSet<>();
	    System.out.println("The Duplicate elements are:");
	    for(int i=0;i<arr.length;i++) {
	    	if(!s.add(arr[i]))
	    		System.out.println(arr[i]);
	    }
	   

	}


	}


