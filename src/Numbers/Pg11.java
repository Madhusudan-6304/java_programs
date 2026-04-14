package Numbers;

public class Pg11 {
	 static int n=1;
	 static int sum=0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			if(n<=100) {
				if(n%2!=0) {
				sum+=n;
				}
				n++;
				main(null);
			}else
				System.out.println("The sum of 100 odd  natural numbers:"+sum);


		}

		// TODO Auto-generated method stub

	}


