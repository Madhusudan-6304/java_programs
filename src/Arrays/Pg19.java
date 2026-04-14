package Arrays;

import java.util.Scanner;

public class Pg19 {

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
    int[] freq=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
    	int count=1;
    	int counted=-1;
    	if(arr[i]==counted) continue;
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			count++;
    			freq[j]=counted;
    		}
    	}
    	if(freq[i]!=counted) {
    		freq[i]=count;
    		System.out.println("The Frequency of "+arr[i]+" is "+freq[i]);
    	}
    
    }

	}

}
