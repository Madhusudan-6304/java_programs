package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pg20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    System.out.println("Enter The Array elements:");
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    for(int num:arr) {
	    	if(h.containsKey(num))
	    		h.put(num, (h.get(num)+1));
	    	else
	    		h.put(num, 1);
	    }
	    for(Map.Entry<Integer,Integer> e:h.entrySet()) {
           System.out.println(e.getKey()+":"+e.getValue());
	}

}
}
