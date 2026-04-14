package Patterns;

public class pg141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int space=rows-1;
		int ch=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int l=0;l<ch;l++) {
				if(l==0||l==ch-1||i==rows-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		
			System.out.println();
			space--;
			ch+=2;
		}

	}

}
