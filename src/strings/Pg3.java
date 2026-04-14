package strings;

public class Pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		char[] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+c[i];
			
		}
		if(s.contentEquals(rev))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not palindrome");
			

	}

}
