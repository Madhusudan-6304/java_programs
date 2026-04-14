package Core_java;

public class Armstrong_num_three_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int n=num;
		double sum=0;
		//int count=0;
		//while(num>0) {
			//num=num/10;
			//count++;
		//}
		// num=n;
		while(num>0) {
			int digit=num%10;
			//sum=sum+Math.pow(digit,count);
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(n==sum)
			System.out.println("It is Armstrong number");
		else
			System.out.println("It is not Armstrong number");
		
   
	}

}
