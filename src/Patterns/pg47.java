package Patterns;

public class pg47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
		int n=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) { 
				if(j>=i)
					System.out.print(n++);
				if(n>9)
					n=1;
				
			}
			System.out.println();
		}

	}

}
