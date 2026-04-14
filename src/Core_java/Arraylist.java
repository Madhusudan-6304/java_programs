package Core_java;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList a1=new ArrayList();
     a1.add(10);
     a1.add(20);
     a1.add(30);
     System.out.println(a1);
     ArrayList a2=new ArrayList();
     a2.add(50);
     a2.add(40);
     a2.addAll(1,a1);
     System.out.println(a2);
     System.out.println(a1.remove(1));
     System.out.println(a1);
     a2.removeAll(a1);
     System.out.println(a2);
     a2.retainAll(a1);
     System.out.println(a2);
    System.out.println(a1.contains(10)); 
    
     
     
     
	}

}
