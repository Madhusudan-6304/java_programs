package Core_java;

import java.util.Scanner;

public class Array_even_dr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("The size:");
     int m=sc.nextInt();
     int []arr=new int[m];
     System.out.println("The Array:");
     for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	}
     System.out.println("The Array of even numbers:");
     for(int i=0;i<arr.length;i++) {
		 if(arr[i] %2 ==0) {
			 System.out.println(arr[i]);
		 }
     }
		 int prod=1;
		 for(int i=0;i<arr.length;i++) {
			 if(i%2 !=0) {
				 prod*=arr[i];
			 }
				 
			 }
		 System.out.println("Product at odd index:"+prod);
		 
	}
     
	}


