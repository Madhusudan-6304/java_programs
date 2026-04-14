package Core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a=new ArrayList<Student>();
		/*Student [] s= {
				new Student(101,"raj",21),
				new Student(104,"raj",19),
				new Student(100,"raj",25),
				
		};*/
		a.add(new Student(101,"raj",21));
		a.add(new Student(104,"raj",19));
		a.add(new Student(100,"raj",25));
		System.out.println("Before Sorting:");
		/*for(int i=0;i<s.length;i++) {
			System.out.println(s[i].id+" "+s[i].name+" "+s[i].age);
		}*/
		for(Student s:a) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		Collections.sort(a);
		System.out.println("After Sorting:");
//		for(int i=0;i<s.length;i++) {
//			System.out.println(s[i].id+" "+s[i].name+" "+s[i].age);
//		}
		for(Student s:a) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		

	}

}
