package Core_java;

public class C_overloading {
	String name;
	int id;
	int age;
	public  C_overloading() {
		System.out.println("I'am no args constructor");
	}
   public C_overloading(int id) {
	   this.id=id;
   }
   public C_overloading(int id,String name) {
	   this.id=id;
	   this.name=name;
   }
   public C_overloading(int id,String name,int age) {
	   this.id=id;
	   this.name=name;
	   this.age=age;
   }

	

}
