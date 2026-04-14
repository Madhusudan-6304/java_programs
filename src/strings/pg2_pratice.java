package strings;

public class pg2_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu";
		char[] x=s.toCharArray();
		String rev="";
		for(int i=x.length-1;i>=0;i--) {
			rev=rev+x[i];
		}
		System.out.println("The Reverse of String:"+rev);

	}

}
