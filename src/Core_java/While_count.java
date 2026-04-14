package Core_java;

public class While_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=143,count=0;
		int n=num;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("The no of digits in "+n +" is :" +count);
		

	}

}
