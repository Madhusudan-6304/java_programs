package Core_java;

public class Student_super_call extends  Person_super_call  {
	int sid;
	public Student_super_call(int sid,String name) {
		super(name);
		this.sid=sid;
	}
 public static void main(String[] args) {
	 //Student_super_call s=new Student_super_call(101,"raj");
	 Person_super_call p=new Student_super_call(101,"raj");//upcasting
	 //System.out.println("Name:"+p.name+" Id:"+p.sid);
	 Student_super_call s =(Student_super_call) p;//downcasting
	  System.out.println("Name:"+s.name+" Id:"+s.sid);
 }
}
