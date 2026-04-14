package Core_java;

public class Constructor_chainingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_chaining c=new Constructor_chaining(101,"raj",21);
		Constructor_chaining c1=new Constructor_chaining(102);
		Constructor_chaining c2=new Constructor_chaining(103,"abc");
		System.out.println("Id:"+c.id+" Name:"+c.name+" Age:"+c.age);

	}

}
