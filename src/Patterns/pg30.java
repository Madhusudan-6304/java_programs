package Patterns;

public class pg30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=6;
		int cols=6;
		int no_space=rows-1;
		for(int i=0;i<rows;i++) {
			int num=1;
			for(int k=i;k<no_space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<cols;j++) {
				 if(j<=i) {
					  System.out.print(num++ +"");
				  }
		}
			System.out.println();
		}


	}

}
