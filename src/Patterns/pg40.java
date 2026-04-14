package Patterns;

public class pg40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
		for(int i=0;i<rows;i++) {
			int n=1+i;
			for(int j=0;j<cols;j++) { 
				if(j>=i)
					System.out.print(n++);
				
			}
			System.out.println();
		}
		}

	}


