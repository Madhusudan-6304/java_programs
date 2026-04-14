package Patterns;

public class pg80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		int no_spaces=0;
		int no_char=2*rows-1;
		for(int i=0;i<rows;i++) {
			char ch=(char)('A'+i);
			for(int j=0;j<no_spaces;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				System.out.print(ch);
			}
			System.out.println();
			no_spaces++;
			no_char-=2;
		}
	}

}
