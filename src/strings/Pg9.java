package strings;

public class Pg9 {
  public static String reverse(String s) {
	  if(s.length()==1)
		  return s;
	  else
		  return  s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="raja";
		System.out.println("The Reverse of Strinhg:"+reverse(s));
		

	}

}
