package Patterns;

public class pg99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_space=0;
		int no_char=2*rows-1;
		for(int i=0;i<rows;i++) {
			char ch=(char)('I'-(2*i));
			for(int j=0;j<no_space;j++) {
				System.out.print(" ");
			}
				for(int k=0;k<no_char;k++) {
					System.out.print(ch--);
				}
				System.out.println();
				no_space++;
				no_char-=2;
						
				}

	}

}
