package Patterns;

public class pg92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int no_spaces=rows-1;
		int no_char=1;
		for(int i=0;i<rows;i++) {
			int num=1+i;
			for(int j=0;j<no_spaces;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<no_char;k++) {
				if(k<no_char/2)
				  System.out.print(num--);
				else
					System.out.print(num++);
					
			}
			System.out.println();
			no_spaces--;
			no_char+=2;
		}


	}

}
