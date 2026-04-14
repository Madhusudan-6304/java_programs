package Patterns;

public class pg69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_space=rows-1;
		int no_char=1;
		for(int i=0;i<rows;i++) {
			int n=1+i;
			for(int j=0;j<no_space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				System.out.print(n);
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}

	}

}
