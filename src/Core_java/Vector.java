package Core_java;
import java.util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> a1=new ArrayList<Integer>();
		     a1.add(10);
		     a1.add(20);
		     a1.add(30);
		     a1.add(50);
		     a1.add(40);
		     Iterator <Integer> i=a1.iterator();
		     while(i.hasNext()) {
		     System.out.println(i.next());
		     }
		     System.out.println("In reverse order");
		     ListIterator <Integer> li=a1.listIterator(a1.size());
		     while(li.hasPrevious()) {
			     System.out.println(li.previous());
			     }
		     
	}

}
