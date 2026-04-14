package strings;


public class Pg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rajaram";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		System.out.println("The Duplicates are:");
		for(int i=0;i<ch.length;i++) {
			boolean isduplicate=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					isduplicate=true;
					break;
				}
				
			}
			if(isduplicate)
				System.out.print(ch[i]+" ");
		}

	}

}
