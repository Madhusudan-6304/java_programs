package Patterns;

public class pg65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
		for(int i=0;i<rows;i++) {
			char ch='E';
			for(int j=0;j<cols;j++) {
				System.out.print(ch--+" ");
			}
			System.out.println();
		}

	}

}
