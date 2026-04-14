package Core_java;

import java.util.Comparator;

public class student1_sortbyid implements Comparator{
	@Override
	public int compare(Object obj1,Object obj2) {
		student1 s1=(student1) obj1;
		student1 s2=(student1) obj2;
		return s1.id-s2.id;
		
		
	}

}
