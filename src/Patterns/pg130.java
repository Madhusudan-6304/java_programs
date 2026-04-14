package Patterns;

public class pg130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_space=rows-1;
		int no_char=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<no_space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				System.out.print((k+1)%2);
					
			}
			System.out.println();
			if(i>=rows/2) {
				no_space++;
				no_char-=2;
			}else {
				no_space--;
				no_char+=2;
			}
		}

	}

}
