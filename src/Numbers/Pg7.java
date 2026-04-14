package Numbers;

public class Pg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int temp=n;
		int sum=0;
		while(temp>0) {
             int lastdigit=temp%10;
             if(lastdigit%2==0) {
            	 System.out.println(lastdigit+" is even");
             }else
            	 System.out.println(lastdigit+" is odd");
             temp/=10;
		}

	}

}
