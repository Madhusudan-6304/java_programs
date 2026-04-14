package Patterns;

public class pg97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_space=0;
		int no_char=2*rows-1;
		for(int i=0;i<rows;i++) {
			char ch='A';
			for(int j=0;j<no_space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
			    System.out.print(ch++);
			    if(k==no_char/2)
			    	ch='A';
				
					
			}
			System.out.println();
			no_space++;
			no_char-=2;
		}

	}

}
