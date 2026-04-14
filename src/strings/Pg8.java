package strings;

public class Pg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raj is handsome";
		String[]x=s.split(" ");
		String min=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i].length()<min.length())
				min=x[i];
		}
		
		System.out.println("The Shortest word in senetence:"+min);

	}


	

}
