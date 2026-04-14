package Patterns;

public class pg138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		int no_char=1;
		int space=rows/2;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				System.out.print("*");
			}
			if(i<rows/2) {
				no_char+=1;
				space--;
			}else {
				no_char-=1;
				space++;
			}
			System.out.println();
		}


	}

}
