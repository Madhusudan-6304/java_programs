package Patterns;

public class pg132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int space=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				  if ((i == 1 && (j == 1 || j == 3 || j == 5)) ||
		                    (i == 2 && (j == 2 || j == 3 || j == 4)) ||
		                    (i == 3) ||
		                    (i == 4 && (j == 2 || j == 3 || j == 4)) ||
		                    (i == 5 && (j == 1 || j == 3 || j == 5))) {
		                    
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
			}
			System.out.println();
			
			
		}

	}

}
