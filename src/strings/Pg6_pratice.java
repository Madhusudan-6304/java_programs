package strings;

public class Pg6_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu is handsome";
		String[] words=s.split(" ");
		String max="";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>max.length())
				max=words[i];
		}
        System.out.println("The Largest Word in senetence:"+max);
	}

}
