package strings;

public class Pg8_pratice {
public static String reverse(String s) {
	if(s.length()==1)
		return s;
	else
		return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu";
		System.out.println(reverse(s));
		

	}

}
