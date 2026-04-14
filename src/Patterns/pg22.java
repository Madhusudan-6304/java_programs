package Patterns;

public class pg22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int cols=5;
		for(int i=0;i<rows;i++) {
			int num=1+i;
			for(int j=0;j<cols;j++) {
			  if(j<=i) {
				  System.out.print(num-- + " ");
			  }else {
				  System.out.print(" ");
			}
		}
			System.out.println();

	}                                                                                                                                                                                                                                                         
	}

}
