package Patterns;

public class pg139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=9;
		int no_char=1;
		int space=rows-1;
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<no_char;k++) {
				System.out.print("*");
			}
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int l=0;l<no_char;l++) {
				System.out.print("*");
			}
			
			if(i<rows/2) {
				no_char+=1;
				space-=2;
			}else {
				no_char-=1;
				space+=2;
			}
			System.out.println();
		}



	}

}
