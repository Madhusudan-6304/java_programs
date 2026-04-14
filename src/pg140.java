
public class pg140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int spaces=rows-1;
		int ch=1;
		for(int i=0;i<rows;i++) {
			for(int j=spaces;j>=0;j++) {
				System.out.print(" ");
			}
			for(int l=0;l<ch;l++) {
				if(i==0||l==ch-1||i==rows-1)
					System.out.print("*");
			}
			System.out.println();
			spaces--;
			ch+=2;
		}

	}

}
