package strings;

public class Pg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Raja";
		String s2="Ram";
		s1=s1+s2;//7
		s2=s1.substring(0,s1.length()-s2.length());//7-3=4
		s1=s1.substring(s2.length());//4
		System.out.println("The String s1="+s1);
		System.out.println("The String s2="+s2);

	}

}
