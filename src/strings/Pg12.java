package strings;

import java.util.Arrays;

public class Pg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="saw";
		String s2="was";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		s1=Arrays.toString(ch1);
		s2=Arrays.toString(ch2);
		if(s1.equals(s2))
			System.out.println("They are anagram");
		else
			System.out.println("They are not anagram");

	}

}
