package Patterns;

public class pg134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if((i==1)||(i==3)||(i==5)||(((i%2==0)&&(j==1 || j==3 ||j==5))))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
