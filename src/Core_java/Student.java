package Core_java;

public class Student implements Comparable{
String name;
int age;
int id;
Student(int id,String name,int age ){
	this.id=id;
	this.name=name;
	this.age=age;
}
public int compareTo(Object obj) {
	Student s=(Student) obj;
	return this.age-s.age;
}

}
