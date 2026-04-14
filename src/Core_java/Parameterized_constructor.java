package Core_java;

public class Parameterized_constructor {
	 int id;
	 String name;
	public Parameterized_constructor(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Parameterized_constructor p=new Parameterized_constructor(101,"abc");
		Parameterized_constructor p1=new Parameterized_constructor(102,"xyz");
		System.out.println("Id:"+p.id+" "+"Name:"+p.name);
		System.out.println("Id:"+p1.id+" "+"Name:"+p1.name);
		
		
		// TODO Auto-generated method stub

	}

}
