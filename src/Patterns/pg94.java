package Patterns;

public class pg94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_spaces=rows-1;
		int no_char=1;
		for(int i=0;i<rows;i++) {
			char ch=(char)('A'+i);
			for(int j=0;j<no_spaces;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				if(k<no_char/2)
				  System.out.print(ch--);
				else
					System.out.print(ch++);
					
			}
			System.out.println();
			no_spaces--;
			no_char+=2;
		}


	}

}
