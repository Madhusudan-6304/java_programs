package strings;

public class Pg12_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi123 madhu";
		s=s.toLowerCase();
		char[] x=s.toCharArray();
		int c1=0,c2=0,c3=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u') {
				c1++;
			}
			else if(x[i]>='a'&& x[i]<='z') {
				c2++;
			}
			else if(x[i]>='1' && x[i]<='9'){
				c3++;
			}

		}
		System.out.println("The vowels:"+c1);
		System.out.println("The consonants:"+c2);
		System.out.println("The Numbers:"+c3);

	}

}
