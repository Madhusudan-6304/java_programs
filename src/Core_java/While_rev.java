package Core_java;

public class While_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=143,rev=0;
		int n=num;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("The Reverse number  of "+n +" is :" +rev);


	}

}
