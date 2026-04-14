package Arrays;

import java.util.Arrays;

public class Pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		//int[] b=new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			b[i]=a[i];
//		}
		int[]b=a.clone();
		
		System.out.println(Arrays.toString(a));
		System.out.println("After copying :");
		System.out.println(Arrays.toString(b));

	}

}
