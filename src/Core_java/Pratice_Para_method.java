package Core_java;

public class Pratice_Para_method {
//take char type data and convert it into double type and find its cube
	public static double cube(char ch) {
		return (ch*ch*ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double res=cube ('A');
        System.out.println("The value of cube is:"+res);
	}

}
