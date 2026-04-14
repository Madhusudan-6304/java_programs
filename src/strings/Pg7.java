package strings;

public class Pg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raj is handsome";
		String[]x=s.split(" ");
		String max="";
		for(int i=0;i<x.length;i++) {
			if(x[i].length()>max.length())
				max=x[i];
		}
		System.out.println("The longest word in senetence:"+max);

	}

}
