package Patterns;

public class pg53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
        int no_space=rows-1; 
		for(int i=0;i<rows;i++) {
			int num=1+i;
			for(int k=i;k<no_space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<cols;j++) { 
				if(j<=i)
					System.out.print(num--);
				
			}
			System.out.println();
		}
		

	}

}
