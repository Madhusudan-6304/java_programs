package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pg16 {

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
	    TreeSet<Integer> t=new TreeSet<Integer>();
	    for(int num:arr) {
	    	t.add(num);
	    }
	    ArrayList<Integer> a=new ArrayList<Integer>();
	    for(int num:t) {
	    	a.add(num);
	    }
	    System.out.println("The largest:"+a.get(a.size()-1));
	    System.out.println("The Second largest:"+a.get(a.size()-2));
	    System.out.println("The Third Largest:"+a.get(a.size()-3));
    
     
     
	}

}
