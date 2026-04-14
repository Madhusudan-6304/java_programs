package Patterns;

public class pg114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=0;i<rows;i++) {
			int n=1+i;
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<rows;k++) {
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
