package Patterns;

public class pg140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=9;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(i==0||j==0||j==rows-1||i==rows-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
