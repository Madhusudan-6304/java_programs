package Core_java;

public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3,count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("It is a prime");
		else
			System.out.println("It is not prime");
//another method of checking prime

	int n=10;
	boolean t=true;
	for(int i=2;i*i<n;i++) {
	
		if(n%i==0)
			t=false;
		  break;
		  
	}
	if(t==true) {
		System.out.println("It is a prime");
		
	}else
		System.out.println("It is not prime");
		
	}
		

}
