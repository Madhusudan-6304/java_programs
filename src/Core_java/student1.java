package Core_java;

import java.util.Arrays;

public class student1 {
String name;
int id;
int age;
student1(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
	student1 [] s= {
			new student1(101,"raj",21),
			new student1(104,"raj",19),
			new student1(100,"raj",25),
	};
	 student1_sortbyid sort=new  student1_sortbyid();
	 student1_sortbyage sort1=new  student1_sortbyage();
	System.out.println("Before Sorting");
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i].id+" "+s[i].name+" "+s[i].age);
	}
	Arrays.sort(s,sort);
	System.out.println("After Sorting");
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i].id+" "+s[i].name+" "+s[i].age);
	}
	
}
}
