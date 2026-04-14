package Core_java;

public class C_overloadingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_overloading c=new C_overloading();
		C_overloading c1=new C_overloading(101);
		C_overloading c2=new C_overloading(102,"raj");
		C_overloading c3=new C_overloading(102,"abc",21);
		System.out.println("Id:"+c1.id);
		System.out.println("Id:"+c2.id+" Name:"+c2.name);
		System.out.println("Id:"+c3.id+" Name:"+c3.name+" Age:"+c3.age);
		
		

	}

}
