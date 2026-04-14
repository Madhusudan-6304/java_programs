package Numbers;

public class Pg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int count=0;
		int temp=n;
		while(temp>0) {
             count++;
             temp/=10;
		}
		System.out.println("The number of digits in "+n+" is:"+count);

	}

}
