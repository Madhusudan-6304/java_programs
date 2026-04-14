package strings;

public class Pg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rajaram";
		char[] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+c[i];
			
		}
		System.out.println("The Reverse of String:"+rev);

	}

}
