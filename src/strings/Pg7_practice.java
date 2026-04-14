package strings;

public class Pg7_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu is handsome";
		String[] words=s.split(" ");
		String min=words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<min.length())
				min=words[i];
		}
        System.out.println("The Largest Word in senetence:"+min);
	}

	}


