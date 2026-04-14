package Patterns;

public class pg23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=6;
		int cols=6;
		for(int i=0;i<rows;i++) {
			int num=rows-i;
			for(int j=0;j<cols;j++) {
			  if(j<=i) {
				  System.out.print(num++ + " ");
			  }else {
				  System.out.print(" ");
			}
		}
			System.out.println();

	}       

	}

}
