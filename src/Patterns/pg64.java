package Patterns;

public class pg64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
       for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) { 
				if(j>=i)
					System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
