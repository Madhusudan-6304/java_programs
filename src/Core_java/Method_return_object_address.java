package Core_java;

public class Method_return_object_address {
	
 private Method_return_object_address() {
	 
 }
 public  static Method_return_object_address getMethod_return_object_address() {
	 Method_return_object_address m=new Method_return_object_address();
	 return m;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_return_object_address m1=Method_return_object_address.getMethod_return_object_address();
		System.out.println(m1);
		
		

	}

}
