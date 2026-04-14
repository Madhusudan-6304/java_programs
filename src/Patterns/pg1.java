package Patterns;

public class pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int cols=5;
		for(int i=0;i<rows;i++) {
			char ch=(char)('A'+i);
			for(int j=0;j<cols;j++) {
			  if(j<=i) {
				  System.out.print(ch);
			  }else {
				  System.out.print(" ");
			}
		}
			System.out.println();

	}
	}


}
