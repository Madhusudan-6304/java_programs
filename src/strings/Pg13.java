package strings;

public class Pg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rajrami121";
		char[] ch=s.toCharArray();
		int count1=0,count2=0,count3=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				count1++;
			else if(ch[i]>='a' && ch[i]<='z')
				count2++;
			else 
				count3++;
		}
		System.out.println("The  Vowels Present are:"+count1);
		System.out.println("the consonants present are:"+count2);
		System.out.println("The Numbers present are:"+count3);

	}

}
