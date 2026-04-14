package strings;

public class pg10_pratice {
public static void isduplicate(char[] x) {
	boolean isduplicate;
	for(int i=0;i<x.length;i++) {
		isduplicate=false;
		for(int j=i+1;j<x.length;j++) {
			if(x[i]==x[j]) {
				isduplicate=true;
				break;
			}
		}
		if(isduplicate) {
			System.out.println(x[i]);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhusudan";
		char[] x=s.toCharArray();
		isduplicate(x);

	}

}
