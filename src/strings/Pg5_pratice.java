package strings;

public class Pg5_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu is handsome";
		String[] words=s.split(" ");
		String rev="";
		int count=0;
		for(int i=0;i<words.length;i++) {
			count++;
		}
		System.out.println("The Count numbers of words in senetence: "+count);


	}

}
