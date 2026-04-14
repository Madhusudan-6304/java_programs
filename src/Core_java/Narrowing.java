package Core_java;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Narrowing is a type of typecasting where we convert  larger datatype to smaller datatype  
	/*Blockers and Risks: here we face data loss*/
		double d=45.67;
		int i=(int) d;
		System.out.println("The value of double d:"+d);
		System.out.println("The value of int i:"+i);
		int m=130;
		byte b=(byte) m;
		System.out.println("The value of int m:"+m);
		System.out.println("The value of byte b:"+b);
	}

}
