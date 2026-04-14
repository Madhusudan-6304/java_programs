package Core_java;

public class Dog_MOverride  extends Animal_Moveride{
public void sound() {
	System.out.println("Dog barks");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_Moveride a=new Animal_Moveride();
		a.sound();
		 a=new Dog_MOverride();
		a.sound();
		
		

	}

}
