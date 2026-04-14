package strings;

import java.util.Arrays;

public class pg11_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="saw";
		String s2="wa";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] x1=s1.toCharArray();
		char[] x2=s2.toCharArray();
		Arrays.sort(x1);
		Arrays.sort(x2);
		s1=Arrays.toString(x1);
		s2=Arrays.toString(x2);
		if(s1.equals(s2)) 
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
