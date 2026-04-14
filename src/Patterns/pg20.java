package Patterns;

public class pg20 {
	public static void main(String[] args) {
		char ch='A';
		int rows=5;
		int cols=5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(ch++ +" ");
			System.out.println();
		}
		
		
	}

}
