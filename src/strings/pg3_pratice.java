package strings;

public class pg3_pratice {
public static void bubblesort(char[] x) {
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x.length-1-i;j++) {
			if(x[j]>x[j+1]) {
				char temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Deepika";
		s=s.toLowerCase();
		char[] x=s.toCharArray();
		bubblesort(x);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}

	}

}
