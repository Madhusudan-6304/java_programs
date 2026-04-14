package Patterns;

public class pg133 {

	public static void main(String[] args) {
		int rows=5;
		int space=rows-1;
		for(int i=0;i<rows;i++){
			for(int j=i;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
			System.out.print("*");
			}
			System.out.println();
				}
		
		
	}

}
