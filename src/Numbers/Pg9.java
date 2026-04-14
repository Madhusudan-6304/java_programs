package Numbers;

public class Pg9 {
    static int n=1;
    static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(n<=100) {
			sum+=n;
			n++;
			main(null);
		}else
			System.out.println("The sum of 100 natural numbers:"+sum);

	}

}
