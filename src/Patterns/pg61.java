package Patterns;

public class pg61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cols=5;
		int rows=5;
       for(int i=0;i<rows;i++) {
    	   char ch='A';
			for(int j=0;j<cols;j++) { 
				if(j>=i)
					System.out.print(ch++);
				
			}
			System.out.println();
		}

	}

}
