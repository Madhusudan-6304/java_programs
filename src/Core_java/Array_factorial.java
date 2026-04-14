package Core_java;

public class Array_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,8,9,1};
		int sum=0;
		System.out.println("Factorial at even index:");
		for(int i=0;i<arr.length;i+=2) {
			int num=arr[i];
			int fact=1;
			for(int j=1;j<=num;j++) {
				fact*=j;
			}
			System.out.println("Index:"+i+"-> "+num+"="+fact);
			sum+=fact;
		}
		System.out.println("The total sum of factorils:"+sum);
		

	}

}
