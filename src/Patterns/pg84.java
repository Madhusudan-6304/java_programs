package Patterns;

public class pg84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=8;
		int no_space=0;
		int no_char=2*rows-1;
		for(int i=0;i<rows;i++) {
			int n=1;
			for(int j=0;j<no_space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				System.out.print(n++ );
				if(n>9)
					n=1;
				
				
			}
			
			
			System.out.println();
			no_space++;
			no_char-=2;
		}

	}

}
