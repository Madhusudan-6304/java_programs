package Core_java;
import java.util.ArrayList;
import java.util.Vector;

public class vector_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		System.out.println(v1);
		Vector a2=new Vector();
	     a2.add(50);
	     a2.add(40);
	     a2.addAll(1,v1);
	     System.out.println(a2);
	     System.out.println(v1.remove(1));
	     System.out.println(v1);
	     a2.removeAll(v1);
	     System.out.println(a2);
	     a2.retainAll(v1);
	     System.out.println(a2);
	    System.out.println(v1.contains(10)); 
	    

	}

}
