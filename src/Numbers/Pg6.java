package Numbers;

public class Pg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int temp=n;
		int sum=0;
		while(temp>0) {
             int lastdigit=temp%10;
             sum+=lastdigit;
             temp/=10;
		}
		System.out.println("The sum of all of digits in "+n+" is:"+sum);

	}

}
