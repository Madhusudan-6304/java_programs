package strings;

public class Pg4_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu is handsome";
		String[] words=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--) {
			rev+=words[i]+" ";
		}
		
		System.out.println("The reverse senetence: "+rev);

	}

}
