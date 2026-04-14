package Patterns;

public class pg27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int cols=5;
		int no_space=rows-1;
		for(int i=0;i<rows;i++) {
			for(int k=i;k<no_space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<cols;j++) {
				 if(j<=i) {
					  System.out.print((i+1)%2 +"");
				  }
		}
			System.out.println();
		}

	}

}
