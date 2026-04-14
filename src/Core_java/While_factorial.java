package Core_java;

public class While_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4,fact=1;
		int n=num;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("The Factorial of  "+n +" is :" +fact);


	}

}
