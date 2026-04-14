package Patterns;

public class pg14 {
	public static void main(String[] args) {
	int rows=5;
	int cols=5;
	int num=1;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(j<=i)
			   System.out.print(num++);
			else
				System.out.print(" ");
			if(num>=10)
				num=1;
		}
        System.out.println();
	}

}
}
