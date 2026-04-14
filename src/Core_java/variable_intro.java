package Core_java;

public class variable_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable are declared inside the block
		int a=10;
		float f=10.55f;
		double d=45.00;
		short s=123;
		byte b=117;
		long l=2345678956l;
		char c='A';
		boolean bol=true;
		
		System.out.println("Value of a:"+a);
		System.out.println("Value of f:"+f);
		System.out.println("Value of d:"+d);
		System.out.println("Value of s:"+s);
		System.out.println("Value of b:"+b);
		System.out.println("Value of l:"+l);
		System.out.println("Value of c:"+c);
		System.out.println("Value of bol:"+bol);
		
		//Blockers and Risks:
		/*if we miss writing l while assigning long datatype to variable we get Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The literal 2345678956 of type int is out of range  */
		/*if we miss writing l while assigning float datatype to variable  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from double to float */
		

	}

}
