package Patterns;

public class pg136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=i;j<rows-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<rows-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
