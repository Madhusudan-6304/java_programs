package Patterns;

public class pg108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int n=1;
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<rows;k++) {
				System.out.print(n++);
				if(n>9)
					n=1;
			}
			System.out.println();
		}


	}

}
