package Patterns;

public class pg120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int cols=5;
		for(int i=0;i<rows;i++) {
			int n=1;
			for(int j=0;j<rows;j++) {
				if(j<=i) {
					System.out.print(n++);
				}else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
