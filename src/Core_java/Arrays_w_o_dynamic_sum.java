package Core_java;

public class Arrays_w_o_dynamic_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("The sum of elements in array:"+sum);
		System.out.println("The Avg of elements in array:"+avg);

	}

}
